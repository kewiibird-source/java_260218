package day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day13.DBClass;

public class 수도퀴즈_DB {
	static Scanner s = new Scanner(System.in);

	public static void runQuiz(Statement stmt) {
		try {
			int count = 0; // sql문에서 count 사용해야하니까 반복문 밖에서 선언
			while(true) {
				System.out.print("원하시는 문제 개수를 입력하세요 : ");
				count = s.nextInt();
				if(count < 3 || count > 10) {
					System.out.println("^^_ 3~10 사이로 입력해주셈");
				} else {
					break; // 반복문을 빠져나가기 위해서 break
				}
			}
			String sql = "SELECT * FROM ( SELECT * FROM TBL_QUIZ ORDER BY DBMS_RANDOM.VALUE ) WHERE ROWNUM <=" + count;
			ResultSet rs = stmt.executeQuery(sql);
			int quizNum = 1;
			int correctNum = 0; // 맞춘 개수 카운트
			while(rs.next()) {
				System.out.print(quizNum + "번) " + rs.getString("COUNTRY") + " : ");
				quizNum++;
				String answer = s.next();
				if(answer.equals(rs.getString("CAPITAL"))) {
					System.out.println("정답!");
					correctNum++;
				} else {
					System.out.print(" <= 오답! 정답은 " + rs.getString("CAPITAL"));
					System.out.println();
				}
			}
			System.out.println("총" + correctNum + "개 맞추셨습니당~");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void addQuiz(Statement stmt) {
		try {
			// 추가할 나라 이름 입력 받은 후 db에 있는지 업는지 확인
			System.out.print("추가할 나라 입력 : ");
			String country = s.next();
			String sql = "SELECT * FROM TBL_QUIZ WHERE country = '" + country + "'";
			ResultSet rs = stmt.executeQuery(sql); // db로 보내는 과정
			if((rs.next())) {
				System.out.println(country + "는(은) 이미 있는 나라임!");
			} else {
				System.out.println(country + "의 수도를 입력해 주세욤 : ");
				String capital = s.next();
				sql = "INSERT INTO TBL_QUIZ VALUES(QUIZ_SEQ.NEXTVAL, '" + country +  "' , '" + capital + "')";
				int result = stmt.executeUpdate(sql);
				if(result > 0) {
					System.out.println("등록됨!");
				} else {
					System.out.println("등록실패 ㅜㅜ");
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void editQuiz(Statement stmt) {
		try {
			// 나라 이름 입력 받은 후 수도 이름 출력 
			// => 필리핀 입력하면 '현재 등록된 수도명은 마니라 입니다. 수정하시겠습니까? (Y/N)'
			// Y누르면 수정 , N누르면 메인 => 그 외 값은 다시 입력.
			// 없는 나라 입력시 '등록되지 않은 나라 입니다' 출력후 메인메뉴
			System.out.print("수정할 나라 입력 : ");
			String country = s.next();
			String sql = "SELECT * FROM TBL_QUIZ WHERE country = '" + country + "'"; // 있나없나 확인
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) { // 있으면 1 => 수정 없으면 0
				System.out.println("현재 등록된 수도명은 " + rs.getString("CAPITAL") + " 입니다. 수정할겨? (Y/N)" );
				while(true) {					
					String answer = s.next();
					if(answer.toUpperCase().equals("Y")) {
						System.out.print("어케수정할겨 : ");
						String capital = s.next();
						sql = "UPDATE TBL_QUIZ SET CAPITAL = '" + capital + "' WHERE COUNTRY = '" + country + "'";
//						int result = stmt.executeQuery(sql);
//						if(result > 0) {
//							System.out.println("수정됐음");
//						} else {
//							System.out.println("수정안됐음 ㅜㅜ");
//						}
//						break;
					rs = stmt.executeQuery(sql);
					if(rs.next()) {
						System.out.println("수정됐음");
					} else {
						System.out.println("수정안됐음 ㅜㅜ");
					}
					break;
						
					} else if(answer.toUpperCase().equals("N")) {
						break;
					} else {
						System.out.println("Y랑 N중에 고르셈");
					}
				}	
			} else {
				System.out.println("등록되지 않은 나라임 -_-");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void removeQuiz(Statement stmt) {

	}

	public static void main(String[] args) {
		// 1.문제 풀이, 2.문제 추가, 3. 문제 수정, 4. 문제 삭제, 5. 종료
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();
		boolean closeFlg = true;
		while (true) {
			System.out.print("[1.문제 풀이, 2.문제 추가, 3. 문제 수정, 4. 문제 삭제, 5. 종료] : ");
			int menu = s.nextInt();
			switch (menu) {
			case 1:
				runQuiz(stmt);
				break;
			case 2:
				addQuiz(stmt);
				break;
			case 3:
				editQuiz(stmt);
				break;
			case 4:
				removeQuiz(stmt);
				break;
			case 5:
				System.out.println("종료됨");
				closeFlg = false;
				break;
			default:
				System.out.println("1~5중에 선택해주세요");
				break;
			}
		}
	}

}
