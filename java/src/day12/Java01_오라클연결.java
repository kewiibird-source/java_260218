package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Java01_오라클연결 {

	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			stmt = conn.createStatement();
//			System.out.println("DB 연결 완료");
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
			
			while(rs.next()) {
				System.out.print(rs.getString("STU_NAME")+"||");
				System.out.print(rs.getString("STU_NO")+"||");
				System.out.println(rs.getString("STU_DEPT"));
			}
			
//			String name = rs.getString("STU_NAME");
//			System.out.println(name);
//			System.out.println(rs.getString("STU_NO"));
//			
//			rs.next();
//			System.out.println(rs.getString("STU_NAME"));
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

}
