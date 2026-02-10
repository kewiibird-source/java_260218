package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java01_과일가게 {
	static Scanner n = new Scanner(System.in);

	static HashMap<String, Object> searchFruit(ArrayList<HashMap<String, Object>> list, String name) {
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> fruit = list.get(i);
			if (fruit.get("name").equals(name)) {
				return fruit;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			int menu = 0;
			try {
				System.out.println("[1. 과일 등록, 2. 가격 수정, 3. 과일 판매] : ");
				menu = n.nextInt(); 
				// 스캐너의 next는 버퍼라는 공간에서 menu에 담으려고 꺼내오려는 성질이 있음.
				// 출력하고 다시 위로 올라가서 입력받음. => 버퍼에 값이 있음 => 다시 꺼내려고함 => 문자열이라 nextInt에 안들어감
				// => 그럼 마지막에 n.next(); 에서 버퍼에 남아있는 값을 빼내줌 => 버퍼에 값이 없으니까 다시 값 받기 기다림
				
				if (menu == 1) {
					// 과일 이름(name), 개수(count), 가격(price) 입력받아서 맵에 저장
					// 해당 맵을 리스트에 저장
					HashMap<String, Object> fruit1 = new HashMap<>();
					System.out.print("과일 이름을 입력해주세요 : ");
					String name = n.next();
					HashMap<String, Object> fruit = searchFruit(list, name);
					if (fruit != null) {
						// 과일 존재함! => 개수 입력받아서 기존개수에 +
						System.out.print("과일 개수를 입력해주세요 : ");
						int count = n.nextInt();
						fruit.put("count", (int) fruit.get("count") + count);
					} else {
						// 과일 없음 => 새롭게 과일등록
						fruit1.put("name", name);

						System.out.print("과일 개수를 입력해주세요 : ");
						int count = n.nextInt();
						fruit1.put("count", count);

						System.out.print("과일 가격을 입력해주세요 : ");
						int price = n.nextInt();
						fruit1.put("price", price);

						list.add(fruit1);
					}
				} else if (menu == 2) {
//					// 과일 이름을 입력받고 있는 과일이면 가격을 입력받아서 해당 가격으로 수정
//					// 없으면 '없는 과일 입니다' 출력 후 메뉴로 이동
					System.out.print("가격을 수정할 과일을 입력해주세요 : ");
					String name = n.next();
					HashMap<String, Object> fruit = searchFruit(list, name);
					if (fruit != null) {
						System.out.print("새로운 가격 입력 : ");
						int price = n.nextInt();
						fruit.put("price", price);
					} else {
						System.out.println("해당 이름의 과일이 없음");
					}
				} else if (menu == 3) {
					System.out.print("과일 이름 : ");
					String name = n.next();
					HashMap<String, Object> fruit = searchFruit(list, name);
					if (fruit != null) {
						System.out.print("구매할 개수 입력 : ");
						int count = n.nextInt();
						if ((int) fruit.get("count") - count < 0) {
							System.out.println("과일 개수 부족");
						} else {
							fruit.put("count", (int) fruit.get("count") - count);
						}
					} else {
						System.out.println("해당 이름의 과일이 없음");
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자입력해라"); 
				n.next();
			}

		}
	}
}