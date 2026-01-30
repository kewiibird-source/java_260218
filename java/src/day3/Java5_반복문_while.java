package day3;

import java.util.Scanner;

public class Java5_반복문_while {

	public static void main(String[] args) {
		// while 무한루프 => 조건이 true일때 계속 반복
//		int a = 1;
//		while(true) {
//			System.out.println(a++);
//		}
		
		// 1. 1번째, 2번째, 3번째 ... 입력되는 숫자를 모두 더하시오.
		// 단, -1을 입력하면 여태 더한 값을 출력하고 종료하시오.
//		Scanner s = new Scanner(System.in);
//		int a = 1;
//		while(true) {
//			System.out.print(a + "번째 숫자를 입력하세요 : ");
//			int b = s.nextInt();
//			a++;
//		} 
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int count = 1;
		while(true) {
			System.out.print(count + "번째 숫자 입력 : ");
			int num = s.nextInt();
			if(num != -1) { 
				sum += num; // sum = sum + num;
			} else {
				break; // -1 입력됐을 경우 탈출
			}
			count++;
		} System.out.println("~숫자들의 합~ : " + sum);
	} 
}

