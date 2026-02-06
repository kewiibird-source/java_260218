package day7.Test260205;

import java.util.Scanner;

public class Test_03번 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 입력 : ");
			int a = in.nextInt();
			if (a < 1 || a > 30) {
				System.out.println("1에서 30 사이로 다시입력");
			} else if (a % 2 == 0) {
				System.out.println("짝수");
			} else if (a % 2 == 1) {
				System.out.println("홀수");
			}
		}

	}

}
