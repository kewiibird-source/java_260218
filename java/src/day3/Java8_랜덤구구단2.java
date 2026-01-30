package day3;

import java.util.Random;
import java.util.Scanner;

public class Java8_랜덤구구단2 {

	public static void main(String[] args) {
		// 1. 사용자가 풀이하고 싶은 문제 수를 직접 정하도록
		// 문제풀이가 끝난 후 다시 풀이할지 말지 사용자가 결정하도록
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
			System.out.println("=== 랜덤 구구단 ===");
		for(;;) {
			System.out.print("[ (1) 구구단 시작 (2) 종료 ] : ");
			int a = s.nextInt();
			if(a != 2) {
				System.out.println("문제 수를 입력해 주세요 : ");
				int b = s.nextInt();
				int count = 0;
				for(int i=1; i<=b; i++) {
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
				System.out.println();
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		} 
	}
}
