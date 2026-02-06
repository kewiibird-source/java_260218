package day7.Test260205;

public class Test_01번 {

	public static void main(String[] args) {
		// 1. 10부터 50까지 중 3의 배수이면서 짝수면 화면에 출력
		for (int i = 10; i < 50; i++) {
			if (i % 3 == 0) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
	}

}
