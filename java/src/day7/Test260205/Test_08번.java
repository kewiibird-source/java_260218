package day7.Test260205;

import java.util.Random;
import java.util.Scanner;

public class Test_08번 {

	public static void main(String[] args) {
		/*
		 * 8. 기본조건 - 메인메뉴는 1~2. 그외 숫자 입력 시 안내 문구 후 다시 입력 - 1번 메뉴 진입 시 난이도 선택. 1~3외 값 입력
		 * 시 안내 문구 후 다시 입력 - 1번 난이도는 2~5단, 2번 난이도는 6~9단, 3번 난이도는 12~19단 문제 출력 - 문제는 5문제
		 * 고정. 5문제 모두 푼 후 맞춘 개수 출력 - 메인 메뉴에서 2번 선택 시 종료
		 */
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		while (true) {
			System.out.print("[1. 구구단 풀기, 2. 종료] : ");
			int a = scn.nextInt();
			if (a != 2) {
				System.out.print("[1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)] : ");
				int b = scn.nextInt();
				int count = 0;
				for (int i = 1; i <= 5; i++) {
					int x = ran.nextInt(4) + 2;
					int y = ran.nextInt(9) + 1;
					System.out.print(i + "번 " + x + " * " + y + " = ");
					int c = scn.nextInt();
					if (x * y == c) {
						System.out.println("정답입니다!");
						count++;
					} else {
						System.out.println("오답입니다!");
					}
				}

			}
			if (a == 2) {
				System.out.println("종료.");
				break;
			} else {
				System.out.println("메뉴는 1~2중에 선택해주세요");
			}

		}

	}
}