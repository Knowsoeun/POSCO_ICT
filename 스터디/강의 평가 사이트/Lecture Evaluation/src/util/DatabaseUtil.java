//실질적으로 DB와 연동하는 부분을 정의한다.

package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseUtil {
	public static Connection getConnection() {
		try { // try-catch: 오류 발생시 오류를 쉽게 처리해주기 위해서 사용
			String dbURL = "jdbc:mysql://localhost:3306/TUTORIAL";
			String dbID = "root";
			String dbPassword="root";
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(dbURL, dbID, dbPassword);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
