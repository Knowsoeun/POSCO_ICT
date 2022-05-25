package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBClose;
import db.DBConnection;
import dto.MemberDto;

public class MemberDao {

	private static MemberDao dao = null;
	
	private MemberDao() {
		DBConnection.initConnection();
	}
	
	public static MemberDao getInstance() {
		if(dao == null) {
			dao = new MemberDao();
		}
		return dao;
	}
	
	public boolean addMember(MemberDto dto) {
		
		String sql = " INSERT INTO MEMBER(ID, PWD, NAME, AGE, BIRTH, ADDRESS, HEIGHT) "
				   + " VALUES(?, ?, ?, ?, ?, ?, ?) ";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("1/3 addMember success");
			System.out.println("AGE"+ dto.getAge());
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPwd());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setString(5, dto.getBirth());
			psmt.setString(6, dto.getAddress());
			psmt.setInt(7, dto.getHeight());
			System.out.println("this is address"+dto.getAddress());
			System.out.println("2/3 addMember success");
			System.out.println(psmt);
			count = psmt.executeUpdate();	
			System.out.println("3/3 addMember success");
			
		} catch (SQLException e) {		
			System.out.println("addMember fail");
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, null);			
		}
		
		return count>0?true:false;
	}
	
	public boolean deleteMember(MemberDto dto) {
		
		String sql = " DELETE FROM MEMBER WHERE ID=? AND PWD=? ";
		
		Connection conn = null;			
		PreparedStatement psmt = null; 	
		ResultSet rs = null;
		
		int count=0;
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("1/3 login success");
				
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPwd());
			System.out.println("2/3 login success");
			
			count = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("login fail");
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);
		}
		
		return count>0;
	}
	
	
	public MemberDto login(MemberDto dto) {
		
		String sql = " SELECT ID, PWD, NAME, AGE, BIRTH, ADDRESS, HEIGHT "
				   + " FROM MEMBER "
				   + " WHERE ID=? AND PWD=? ";
		
		Connection conn = null;			
		PreparedStatement psmt = null; 	
		ResultSet rs = null;
		
		MemberDto mem = null;
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("1/3 login success");
				
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPwd());
			System.out.println("2/3 login success");
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				String id = rs.getString(1);
				String pwd = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				String birth = rs.getString(5);
				String address = rs.getString(6);
				int height = rs.getInt(7);

				mem = new MemberDto(id, pwd, name, age, birth, address, height);
			}		
			System.out.println("3/3 login success");
			
		} catch (SQLException e) {
			System.out.println("login fail");
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);
		}
		
		return mem;
	}
	
	
}
