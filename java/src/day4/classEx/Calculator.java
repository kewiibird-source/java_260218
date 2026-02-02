package classEx;

public class Calculator {
	double pi = 3.141592;

	Calculator() {
		System.out.println("계산기 생성!");
	}

	void intro() {
		System.out.println("아주아주좋은 계산기 입니다!");
	}

	int abs(int x) { // 절대값으로 되돌려주는거
		return x < 0 ? -x : x;
	}
//		삼항연산자
//		int y = x < 0 ? -x : x;
//		return y;
//		
//		if사용했을때
//		int y;
//		if (x < 0) {
//			y = -x;
//		} else {
//			y = x;
//		}
//		return y;

	int sum(int x, int y) {
		return x + y;
	}

	double sum(int x, double y) {
		return x + y;
	}

	int sum(int x, int y, int z) {
		return x + y + z;
	}

}
