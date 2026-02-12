package day12;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Java04_오라클_업데이트 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		// 학번 입력받아서 
		try {
			System.out.print("업데이트할 학생의 학번을 입력하세요 : ");
			String stuNo = n.next();
			String sql = "UPDATE STUDENT SET STU_CLASS = 'D' WHERE STU_NO = '"+stuNo + "'";
//			System.out.println(sql);
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("업데이트됐음");
			} else {
				System.out.println("해당학번학생없음");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
