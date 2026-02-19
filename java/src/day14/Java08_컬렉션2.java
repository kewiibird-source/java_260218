package day14;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java08_컬렉션2 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		HashMap<String, Object> map = new HashMap<>();
//		map.put("name", "홍길동");
//		map.put("addr", "인천");
//		map.put("age", 30);
//		map.put("age", (Integer)map.get("age")+1);
//		System.out.println(map);

//		나이를 잘못 입력(ex 문자 입력)할 경우 안내문구 후 나이만 다시 입력

		System.out.print("이름 : ");
		String name = n.next();
		map.put("name", name);

		System.out.print("주소 : ");
		String addr = n.next();
		map.put("addr", addr);

		while (true) {
			try {
				System.out.print("나이 : ");
				int age = n.nextInt(); // 버퍼때문에 무한루프에 빠짐
				map.put("age", age);
				break;
			} catch (InputMismatchException e) {
				System.out.println("나이에는 숫자를 입력하셈");
				n.next(); // 버퍼 비우기!
			}
		}
	}
}
