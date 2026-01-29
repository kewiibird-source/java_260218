package day2;

public class Java15_삼항연산자 {

	public static void main(String[] args) {
		// 삼항연산자 => 상황에 따라 if ~else를 간단하게 처리하는 문법
		int score = 85;
		String grade = score >= 60 ? "P" : "F";
//		String grade
//		if(score >= 60) {
//			grade = "P"
//		} else {
//			grade = "F"
//		}
			// 앞의 조건이 참이냐 거짓이냐의 따라서 ? 뒤의 값중에 하나를 넣겠다!
			// [score >= 60] 이 참이면 [P], 거짓이면 [F]를 [grade]에 넣는다.
	}

}
