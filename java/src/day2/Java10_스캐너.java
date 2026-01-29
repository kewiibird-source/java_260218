package day2;

import java.util.Scanner;

public class Java10_스캐너 {

	public static void main(String[] args) {
		// import 자동 => Ctrl + Shift + o(알파벳)
		// 스캐너 => 사용자로부터 값을 입력받기 위한 용도
		Scanner s = new Scanner(System.in);
//		s.next(); => 문자를 입력받는 기능
//		s.nextInt(); => 숫자(정수)를 입력받는 기능
//		s.next(); 값 입력받기 위해서 잠깐 ^대기^, 입력 후 엔터 누르면 실행.
		
		System.out.println("숫자를 입력해 주세요 : ");
//		System.out.print^ln^ 지우면 줄바꿈 안됨~~
		int input = s.nextInt(); // 사용자가 입력한 값이 input에 들어감
		System.out.println(input >= 10);
		
		System.out.println("== 프로그램 종료 ==");
		
	}

}
