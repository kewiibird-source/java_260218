package day13;

import java.awt.SystemColor;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Set;

import day12.DBClass;

public class Java01_성적관리프로그램 {
	static Scanner n = new Scanner(System.in);
	// 학번 입력받아서 학생 있는지 확인
//	public static ResultSet overlap (Statement stmt) {
//		try {
//			System.out.print("학번 입력 : ");
//			String stuNo = n.next();
//			String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '"+ stuNo +"'";
//			return stmt.executeQuery(sql);	
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		return null;	
//	}
	// 1.학생추가
	public static void addStu(Statement stmt) {
		try {
			System.out.print("학번 : ");
			int stuNo = n.nextInt();
			if(!(Integer.toString(stuNo).length() == 4)) {
				System.out.println("학번은 1~4자리로 입력하셈");
			} else {
				String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO =" + stuNo;
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next()) {
					System.out.println("!!!학번이 중복됨!!!");
				} else {
					System.out.print("이름 : ");
					String name = n.next();		
					System.out.print("학과 : ");
					String dept = n.next();
					sql = "INSERT INTO TBL_STUDENT(STU_NO,STU_NAME,STU_DEPT)"
							+ " VALUES("+ stuNo +",'"+ name +"','"+ dept +"')";
					int result = stmt.executeUpdate(sql);
					if(result > 0) {
						System.out.println(name + "을 추가하였습니다.");
					} 
				}		
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	// 2. 성적입력
	public static void addGrade(Statement stmt) {
		try {
			System.out.print("학번 입력 : ");
			String stuNo = n.next();
			String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '"+ stuNo +"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.print("자바 점수 : ");
				int java = n.nextInt();
				System.out.print("오라클 점수 : ");
				int oracle = n.nextInt();
				System.out.print("html 점수 : ");
				int html = n.nextInt();
				
				sql = "UPDATE TBL_STUDENT SET JAVA = "
						+ java + ", ORACLE = " + oracle + ", HTML = " +  html
								+ " WHERE STU_NO = '" + stuNo + "'"; 
//				System.out.println(sql);
				int result = stmt.executeUpdate(sql);
				if(result>0) {
					System.out.println("성적이 추가되었습니다!");
				}
				
			} else {
				System.out.println("없는 학생임");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// 3. 성적확인
	public static void cheakGrade(Statement stmt) {
		try {
			System.out.print("학번 입력 : ");
			String stuNo = n.next();
			String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '"+ stuNo +"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {	
					System.out.println(rs.getString("STU_NAME"));
					System.out.println(rs.getString("JAVA"));
					System.out.println(rs.getString("ORACLE"));
					System.out.println(rs.getString("HTML"));
			} else {
				System.out.println("해당학생없슴");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		// 1.학생추가(학번, 이름, 학과 입력받고 저장)
		// 	-> 학번 : 중복체크 후 저장(PK), 학번은 무조건 4자리
		// 2. 성적입력
		// 	-> 학번을 입력받은 후 해당 학생 존재하는지 확인
		// 	-> 자바, 오라클, HTML 점수를 입력받아서 DB에 저장
		// 	-> 점수는 0~100사이 값을 입력받고 저장함
		// 3. 성적확인
		// 	-> 학번을 입력받은 후 해당 학생 존재하는지 확인
		// 	-> 해당 학생의 이름, 각 과목의 점수를 출력
		// 4. 성적수정
		// 	-> 학번을 입력받은 후 해당 학생 존재하는지 확인
		// 	-> 수정하고자 하는 과목 선택(1.자바, 2.오라클, 3.HTML)
		// 	-> 점수 입력받은 후(0~100) 수정
		// 5. 종료
			try {
				boolean flg = true;
				while(true) {
				System.out.print("[1.학생추가 2.성적입력 3.성적확인 4.성적수정 5.종료] : ");
				int menu = n.nextInt();
				switch (menu) {
				case 1:
					addStu(stmt);
					break;
				case 2:
					addGrade(stmt);
					break;
				case 3:
					cheakGrade(stmt);
					break;
				case 4:
//					editGrade(stmt);
					break;
				case 5:
					System.out.println("종료되었습니다.");
					flg = !flg;
					break;

				default:System.out.println("1~5 사이 메뉴를 선택하세요");
					break;
				}
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
	}

}
