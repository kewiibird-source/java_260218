package day12;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Java03_오라클_삭제2 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		// 이 두줄은 필수!!
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		
		try {
			// 스캐너로 학번 입력받아서 해당 학번 가진 학생 삭제
			System.out.print("삭제할 학생의 학번을 입력하세요 : ");
			String delete = n.next();
			int result = stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NO = '"+delete+"'");
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
