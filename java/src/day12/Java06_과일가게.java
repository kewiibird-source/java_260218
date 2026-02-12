package day12;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Java06_과일가게 {
	static Scanner n = new Scanner(System.in);

	public static void addFruit(Statement stmt) {

		try {
			// 과일 이름, 개수, 가격 입력받아서 DB(TBL_FRUIT)에 저장
			// 과일 이름이 이미 있는 경우 개수만 입력받아서 기존거에 더해주기.
			System.out.print("과일 이름 : ");
			String name = n.next();
			System.out.print("과일 개수 : ");
			int count = n.nextInt();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '" + name + "'";
			ResultSet rs = stmt.executeQuery(sql);
			// NAME은 유니크함, true/false 둘중 하나만 나오니까 next()를 조건에 넣음
//				Integer.parseInt(rs.getString("COUNT"));
			if (rs.next()) {
//				int updateCnt = rs.getInt("COUNT") + count;
//				sql = "UPDATE TBL_FRUIT SET COUNT = "+updateCnt+" WHERE NAME = '"+name+"'";
				int updateCnt = rs.getInt("COUNT") + count;
				sql = "UPDATE TBL_FRUIT SET COUNT = "+
						(rs.getInt("COUNT")+count)+" WHERE NAME = '"+name+"'";
				int result = stmt.executeUpdate(sql);
				if(result > 0) {
					System.out.println(name+"의 개수가 추가 되었습니다.");
				} else {
					System.out.println("추가에 실패했습니다.");
				}
			} else {
					System.out.print("과일 가격 : ");
					int price = n.nextInt();
					sql = "INSERT INTO TBL_FRUIT" + 
							" VALUES('"+ name +"', "+ price +", "+ count +")";
					int result = stmt.executeUpdate(sql);
					if(result>0) {
						System.out.println(name+"이(가) 추가되었습니다!");
					}
				}
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void sellFruit(Statement stmt) {
		
		try {
			System.out.print("판매할 과일이름 : ");
			String name = n.next();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '"+name+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.print("판매 개수 : ");
				int count = n.nextInt();
				if(rs.getInt("COUNT") >= count) {
					sql = "UPDATE TBL_FRUIT SET COUNT = " +
							(rs.getInt("COUNT") - count) + 
							" WHERE NAME = '"+name+"'";
					int result = stmt.executeUpdate(sql);
					if(result > 0) {
						System.out.println("판매완료");	
					}
				} else {
					System.out.println("수량부족! 판매가능개수는 "+rs.getInt("COUNT"));
				}
			} else {
				System.out.println("그런과일없어");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	
	//삭제
	public static void removeFruit(Statement stmt) {
		
		try {
			// 과일 이름 입력받고 삭제하기
			// 과일 이름이 db에 있으면 정말 삭제할지 한번 더 물어보고('Y''N')삭제
			// 대소문자 구분 없이 y 하면 삭제 n하면 메뉴로 이동
			// 그외 문자 입력 시 y n 중에 선택하셈 출력후 다시 입력하도록 => 무한루프
			// 과일 이름 없으면 '해당과일은존재하지않습니다' 출력 후 메뉴로
			System.out.print("삭제할 과일이름 : ");
			String name = n.next();
			String sql = "SELECT * FROM TBL_FRUIT WHERE NAME = '"+name+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				while(true) {
					System.out.print(name+"을(를) 삭제하시겠습니까? |Y|N|");
					String answer = n.next();
					if(answer.toUpperCase().equals("Y")) {
						sql = "DELETE FROM TBL_FRUIT WHERE NAME = '"+name+"'";
						int result = stmt.executeUpdate(sql);
						if(result > 0) {
							System.out.println("삭제됨!");
							break;
						}
					} else if(answer.toUpperCase().equals("N")) {
						return;
					} else {
						System.out.println("Y/N중 선택해");
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	
	
//	public static void searchFruit(Statement stmt) {
//		try {
//			String sql = "SELECT * FROM TBL_FRUIT";
//			ResultSet rs = stmt.executeQuery(sql); 
			// 오라클의 조회결과를 resultset 객체에 담아서 보여주는거
//			rs.next(); 커서가 밑으로 내려가면서
//			System.out.println(rs.getString("NAME"));
//			while(rs.next()) {
				// 커서가 움직이면서 데이터가 있을때, 트루 => 데이터 개수만큼 반복.
//				System.out.println(rs.getString("NAME"));
//				
//			}	
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
	
	
	
	

	public static void main(String[] args) {
		// select-search, update-edit, delete-remove, 
		DBClass db = new DBClass();
		Statement stmt = db.getStmt();

		try {
			// 1. 과일 추가 2, 과일 판매 3. 가격 수정 4. 과일 삭제 5. 종료
			boolean flg = true;
			while (true) {
				System.out.print("[1.과일 추가 2,과일 판매 3.가격 수정 4.과일 삭제 5.과일 확인 6. 종료] : ");
				int menu = n.nextInt();
				switch (menu) {
				case 1:
					// 과일추가로직함수
					addFruit(stmt);
					break;
				case 2:
					sellFruit(stmt);
					break;
				case 3:

					break;
				case 4:
					removeFruit(stmt);
					break;
				case 5:
//					searchFruit(stmt);
					break;
				case 6:
					System.out.println("종료되었습니다");
					flg = !flg;
					break;

				default:
					System.out.println("1~6 사이 메뉴를 선택하세요");
					break;
				}
				break;
			}
		} catch (Exception e) {

		}
	}

}
