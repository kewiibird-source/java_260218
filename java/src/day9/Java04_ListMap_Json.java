package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java04_ListMap_Json {

	public static void main(String[] args) {
		// 3명의 사람정보를 입력받아 리스트 안에 저장
		// 이름, 나이, 자바 점수
		Scanner n = new Scanner(System.in);
//		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<String> list = new ArrayList<>();
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			String name = n.next();
			map.put("name", name);

			System.out.print("나이 : ");
			int age = n.nextInt();
			map.put("age", age);

			System.out.print("자바 : ");
			int java = n.nextInt();
			map.put("java", java);

			list.add(map);

		}
		System.out.println(list);

		// 자바점수가 60점 미만이면 60점으로 변경
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			if ((int) user.get("java") < 60) {
				user.put("java", 60);
			}
		}
		System.out.println(list);	
	}

}
