package day7.Test260205;

public class Test_05번 {

	public static void main(String[] args) {
		// 5. 2단부터 9단까지 구구단 출력
		// 단, 짝수(2,4,6,8)단만 출력
		System.out.println("☆ 짝수 구구단 ☆");
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 0) {
				System.out.println("=== " + i + "단 ===");
			}
			for (int j = 1; j <= 9; j++) {
				if (i % 2 == 0) {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
			}
		}
	}

}
