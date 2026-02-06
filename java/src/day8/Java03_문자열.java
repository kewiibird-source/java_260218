package day8;

import java.util.Scanner;

public class Java03_문자열 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a == b); // true

		String c = "안녕?"; // 리터럴
		String d = "안녕?";
		String e = new String("안녕?"); // 힙메모리
		System.out.println(c == d); // true
		System.out.println(d == e); // false
		System.out.println(d.equals(e)); // true
		
		Scanner s = new Scanner(System.in);
		String f = s.next();
		System.out.println(c ==f);
		System.out.println(c.equals(f)); // true
		
		// String 비겨할땐 꼭 equals 사용

	}

}
