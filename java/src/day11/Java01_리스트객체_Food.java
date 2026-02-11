package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Java01_리스트객체_Food {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		ArrayList<Food> list = new ArrayList<>();
		ArrayList<String> foodNameList = new ArrayList<>();

		while (true) {
			System.out.println("[1. 제품등록, 2. 제품삭제, 3. 종료] : ");
			int menu = n.nextInt();
			if (menu == 1) {
				// 제품이름, 가격을 입력받아서 Food 객체로 만든 후 리스트에 저장
				// 중복된 이름 허용 x 가격은 0이하 x

//				try {
//
//				} catch (Exception e) {
//					System.out.println("숫자입력하셈");
//					n.next();
//				}
				boolean foodFlg = true;
				String name = "";
				while (foodFlg) {
					System.out.print("제품의 이름을 입력 : ");
					name = n.next();
					foodFlg = foodNameList.contains(name);
					if (foodFlg) {
						System.out.println("중복된이름");
					}
				}
				int price = 0;
				while (true) {
					// 정상적인가격을 입력할때까지 무한루프
					System.out.print("제품의 가격을 입력 : ");
					price = n.nextInt();
					if (price <= 0) {
						System.out.println("가격은 1원 이상부터");
					} else {
						break;
					}
				}
				Food foo = new Food(name, price); // 입력받은값으로 객체생성하기
				list.add(foo); // 생성된 객체 리스트에 저장
				foodNameList.add(name); // 제품이름리스트
				System.out.println(list);

			} else if (menu == 2) {
				// 제품이름 입력 -> 해당 제품 삭제 , 제품이름 없으면 '없는제품'
				// 있으면 리스트에서 제거

				System.out.print("제품의 이름을 입력 : ");
				String name = n.next();
				boolean nameFlg = foodNameList.contains(name);
				if (nameFlg) {
					for (int i = 0; i < list.size(); i++) {
						Food f = list.get(i);
						if (f.getName().equals(name)) {
							list.remove(i);
							foodNameList.remove(i);
							break;
						} else {
							System.out.println("없는제품임");
						}
					}
				}
				System.out.println(list);

			} else if (menu == 3) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("1~3중 고르세요");
			}
		}
	}

}
