package day12;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Java05_오라클_INSERT {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		// 학번, 이름, 학과를 입력받아서 STUDENT 테이블에 저장
		try {
			// 학번은 8글자로 입력할 수 있도록
			String stuNo;
			while(true) {
				System.out.print("학생의 학번을 입력하세요 : ");
				stuNo = n.next();
				if(stuNo.length() != 8) {
					System.out.println("학번은 8글자 입니다~");
				} else {
					// 학번 중복 확인 => DB에서 조회
					ResultSet rs = stmt.executeQuery(
							"SELECT * FROM STUDENT WHERE STU_NO = '"+stuNo+"'");
					if(rs.next()) { 
						// 조회가 되면 트루 , 조회가 안되면 펄스
						System.out.println("이미 사용중인 학번입니다.");
					} else {
						System.out.println("사용가능");
						break;
					}
				}
			}
			System.out.print("학생의 이름을 입력하세요 : ");
			String name = n.next();
			System.out.print("학생의 학과를 입력하세요 : ");
			String dept = n.next();
			
			String sql = "INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT)" +
							" VALUES('"+ stuNo +"', '"+name+"', '"+dept+"')";
//			System.out.println(sql);
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("업데이트 되었습니다");
			} else {
				System.out.println("실패");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
