/*
DAO: 실질적으로 DB와 1:1로 연동되어서 데이터 베이스에 기록하고 가져오고 수행하는 부분
=데이터 접근 개체 
 */
package user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.DatabaseUtil;

public class userDAO {
	// 회원가입 하는 함수
	public int join(String userID, String userPassword) {
		String SQL="INSERT INTO USER VALUES(?, ?)";
		try {
			Connection conn=DatabaseUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			pstmt.setString(2, userPassword);
			return pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

}
