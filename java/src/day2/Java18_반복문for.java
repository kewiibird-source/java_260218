package day2;

import java.util.Scanner;

public class Java18_반복문for {

	public static void main(String[] args) {
		// for
		// for(선언부;조건식;증감식)
//		for(int i=1; i<=10; i++) {
//			System.out.println(i); // => 1-10까지 출력
//		}
//		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum); // => 1-10을 더한 값
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		int input = s.nextInt();
		
		int sum = 0;
		for(int i=1; i<=input; i++) {
			sum = sum + i;
		}
		System.out.println("1부터"+input+"까지의 합은 "+sum);
		
		
	}

}
