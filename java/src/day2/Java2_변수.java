package day2;

public class Java2_변수 {

	public static void main(String[] args) {
		// 변수는 언제든 값이 변경될 수 있다.
		double height = 170.5;
		height = 170.5 + 1; // 사칙연산 가능! => 171.5
		
		// final 키워드를 붙이면 값을 변경할 수 없다.
		// final 변수는 모두 대문자로 -> final이구나~ 알 수 있음
		// '상수(수정할수없는값)'라고 표현한다.
		final double PI = 3.14;
//		pi = 3.555; final 이므로 수정 할 수 없다.

		// java 에서의 (=)은 오른쪽의 값을 변수에 넣는다!
		int number = 50;
		int number2 = number + 10;
		
		int weight = 50; // 50.0이 될수도 있기 때문에 double형으로 변환이 가능
		double weight2 = weight; 
		
		// double형은 int보다 큰 개념이므로 불가능하지만,
		// 강제형변환을 통해서 가능하게 할 수 있다.
		// 값의 손실이 발생
		double weight3 = 50.5;
		int weight4 = (int) weight3; // 더블형을 인트형으로 강제로 바꿀래~ (int)
		System.out.println(weight4); // => 50 출력 (0.5값을 잃음)

				
	}

}
