package day12;

import java.sql.SQLException;
import java.sql.Statement;

public class Java02_오라클_삭제 {

	public static void main(String[] args) {
		// 이 두줄은 필수!!
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		
		try {
			int result = stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NO = '12345678'");
			if(result>0) {
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("해당 학생 없슴!");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
