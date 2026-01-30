package day3;

import java.util.Random;
import java.util.Scanner;

public class Java7_랜덤구구단_Random {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
//		for(int i=1; i<=3; i++) {
//			int x = ran.nextInt(8)+2; // 0~7
//			int y = ran.nextInt(9)+1;
//			System.out.print("[" + i + "번 문제] ");
//			System.out.print(x + " * " + y + " = ");
//			int answer = s.nextInt();
//			if(x*y == answer) {
//				System.out.println("정답");
//			} else {
//				System.out.println("오답");
//			}
//		}
		
		// 1. 5문제를 다 풀고 몇문제 맞췄는지 알림 -> '총 00문제 맞췄어요' 출력
		int count = 0;
		for(int i=1; i<=5; i++) {
			int x = ran.nextInt(8)+2;
			int y = ran.nextInt(9)+1;
			System.out.print("[" + i + "번 문제] ");
			System.out.print(x + " * " + y + " = ");
			int answer = s.nextInt(); 
			if(x*y == answer) {
				System.out.println("정답!"); 	
				count++;
			} else {
				System.out.println("오답");
			}
		} 
		System.out.println("총 " + count +" 문제 맞추셨습니다.");
	}

}
