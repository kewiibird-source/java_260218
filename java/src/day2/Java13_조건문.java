package day2;

import java.util.Scanner;

public class Java13_조건문 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("학점을 입력해 주세요 : ");
		int score = s.nextInt();
		
		// 조건을 줄 때는 순서도 중요하다.
		if(score >= 90) {
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		} else if(score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}

	}
}