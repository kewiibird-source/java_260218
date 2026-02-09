package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Java07_복습 {
	// 오버로딩! (인자값이 다름)
	static void test() {
		System.out.println("매개변수 없는 메소드!");
	}

	static void test(int x) {
		System.out.println("매개변수 한개!");
	}

	static int test(int x, int y) {
		System.out.println("매개변수 두개!");
		return x + y;
	}

	static void test(HashMap<String, Object> map) {
	}

	public static void main(String[] args) {
		// 클래스 만들기(변수 + 메소드)
		// 메소드 생성 및 호출
//		test();
//		test(10);
		int a = test(5, 10); // a라는 변수안에 x+y 값이 들어옴!

		Scanner n = new Scanner(System.in);
		ArrayList<String> StringList = new ArrayList<>();
		// 스캐너로 값을 입력받아서 StringList에 순서대로 넣기
		// stop 이라고 입력하는 순간 더이상 입력안받고 종료

		while (true) {
			System.out.println("문자열 입력 : ");
			String text = n.next();
			// 문자열 비교는 equals , toLowerCase() 소문자로 변경해줌
			if (text.toLowerCase().equals("stop")) {
				System.out.println("종료!");
				break;
			}
			StringList.add(text);
		}
		System.out.println(StringList);

	}

}
