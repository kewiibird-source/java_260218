package day14;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day13.DBClass;

public class Java09_DB {
	
	public static void searchStudent(Statement stmt){
		try {
			String sql = "SELECT * FROM TBL_STUDENT";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print("학번 : " + rs.getString("STU_NO") + ", ");
				System.out.println("이름 : " + rs.getString("STU_NAME"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void addStudent(Statement stmt) {
		Scanner n = new Scanner(System.in);		
		try {
				String stuNo = "";
				while(true) {
					System.out.print("학번 : ");
					stuNo = n.next();
					String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.println("이미 사용중인 학번이얌..");
						continue;
					} else {
						break;
					}
				}
			System.out.print("이름 : ");
			String name = n.next();
			System.out.print("학과 : ");
			String dept = n.next();
			String sql = "INSERT INTO TBL_STUDENT(STU_NO, STU_NAME, STU_DEPT) "+
						"VALUES('" + stuNo + "', '" + name + "', '" + dept + "')";
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("추가완료 ^^");
			} else {
				System.out.println("잘안됐음 ㅠㅠ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int inputscore(String subject) {
		Scanner n = new Scanner(System.in);
		int score = 0;
		while(true) {
			System.out.print(subject + " :");
			score = n.nextInt();
			if(score >= 0 && score <= 100 ) {
				break;
			} else {
				System.out.println("점수는 0~100으로 입력!");
			}
		}
		return score;
	}
	
	public static void editStudent(Statement stmt) {		
		Scanner n = new Scanner(System.in);
		try {
			String stuNo = "";
			while(true) {
				System.out.print("학번 : ");
				stuNo = n.next();
				String sql = "SELECT * FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next()) {
					System.out.print("[1. 자바 2. 오라클 3. html] : ");
					int menu = n.nextInt();
					int score = 0;
					String subject = "";
					switch (menu) {
					case 1:
						score = inputscore("자바");
						subject = "JAVA";
						break;
					case 2:
						score = inputscore("오라클");
						subject = "ORACLE";
						break;
					case 3:
						score = inputscore("html");
						subject = "HTML";
						break;

					default:
						System.out.println("1~3중에 선택해!!");
						break;
					}
					sql = "UPDATE TBL_STUDENT SET " + subject +" = " + score +
							" WHERE STU_NO = '" + stuNo + "'";
					System.out.println(sql);
							int result = stmt.executeUpdate(sql);
							if(result > 0) {
								System.out.println("수정되었음");
							} else {
								System.out.println("수정실패!");
							}
						break;
						
					}else {
						System.out.println("없는 학번이야!!");
					}
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void removeStudent(Statement stmt) {
		Scanner n = new Scanner(System.in);
		try {
			System.out.print("삭제할 학생 학번 입력하셈 : ");
			String stuNo = n.next();
			String sql = "DELETE FROM TBL_STUDENT WHERE STU_NO = '" + stuNo + "'";
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("삭제됐어용");
			} else {
				System.out.println("삭제실패 ㅠㅠ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		
		// 1. 검색, 2. 추가, 3. 수정, 4. 삭제
		while(true) {
			System.out.print("[1. 검색, 2. 추가, 3. 수정, 4. 삭제] : ");
			int menu = n.nextInt();
			
			if(menu == 1) {
				searchStudent(stmt);
			} else if(menu == 2) {
				addStudent(stmt);
			} else if(menu == 3) {
				editStudent(stmt);
			} else if(menu == 4) {
				removeStudent(stmt);
			} else if(menu == 5) {
				System.out.println("종료됨");
			} else {
				System.out.println("1~5 사이 메뉴 고르셈");
			}
		}
	}

}
