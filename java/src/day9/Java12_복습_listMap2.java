package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java12_복습_listMap2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		// 3명의 사람 정보 입력해서 리스트에 저장
		// 이름(name), 나이(age)

		for (int i = 0; i < 3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 : ");
			String name = a.next();
			map.put("name", name);

			System.out.print("나이 : ");
			int age = a.nextInt();
			map.put("age", age);
			// 여기까지 사람 1명의 정보

			list.add(map);
			// 리스트에 사람 정보 넣기
		}
		System.out.println(list);
		// 리스트 목록 출력
//		[{name=홍, age=25}, {name=김, age=22}, {name=박, age=26}]

		// 리스트에 있는 맵에서 나이(age)가 25이상인 맵에 나이를 +1하기
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> map = list.get(i);
			// int a = arr[i]랑 같은 느낌
			if ((int)map.get("age") >= 25) { // wraper 클래스 Integer > int로 언박싱
				map.put("age", (int)map.get("age")+1); // "age"의 값은 Object이니까  int로 다운캐스팅
			}
		}
		System.out.println(list);
//		[{name=홍, age=26}, {name=김, age=22}, {name=박, age=27}]
	}

}
