package day2;

public class Java8_비교연산자 {

	public static void main(String[] args) {
		// 크다, 작다, 같다, 다르다
		int a = 10;
		int b = 5;
		System.out.println(a > b); // true
		System.out.println(a < b); // false
		System.out.println(b > 3); // true
		System.out.println(a >= 10); // true
		System.out.println(b <= 5); // true
		System.out.println(a == b); // false
		System.out.println(a != b); // true 
		
		System.out.println(!true); // false 느낌표는 부정의 의미
		System.out.println(!(a == 10)); // false a==10은 맞지만 !때문에 거짓이 됨

	}

}
