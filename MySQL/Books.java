import java.sql.*;

public class Books {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/web3";
		String id = "root";
		String password = "1234";
		Connection conn = null;  // db에 접속
		Statement stmt = null;  // sql 명령어 실행
		ResultSet rs = null;        // 결과셋 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //드라이버 로딩
			conn = DriverManager.getConnection(url,id,password); // db에 접속
			String sql = "select * from books";
			//String sql = "insesrt into books (title, author, year, price) "
			//		+"   values('자료구조', '이한빛','2022',50000)";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); // sql 실행 객체
			while(rs.next()) {
				int book_code = rs.getInt("book_code");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String year = rs.getString("year");
				int price = rs.getInt("price");
				System.out.println(book_code+"\t"+title+"\t"+author+"\t"+year+"\t"+price);			
			} 
			}catch (Exception e) {
				 e.printStackTrace();
			 }
		}

	}




