package day2;

public class Java9_논리연산자 {

	public static void main(String[] args) {
		// and(&&), or(|| 시프트 원화표시)
		// and => 둘 다 만족(true)시 true
		// or => 둘 중 하나라도 만족(true)시 true
		
		System.out.println(true && true); // true
		System.out.println(true && false); // false		
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		
		int a = 10;
		int b = 5;
		System.out.println(a > b && a > 10); // false
		System.out.println(b > 8 || a > 8); // true
		System.out.println(a >= 10 && b > 3); // true

		System.out.println(a >= 10 || b > 3); // true
		// && || 연산자를 2개를 쓰는 이유는 
		// and일 경우 앞에서 false일경우 뒤에는 계산 안하고 넘어감
		
		
		
	}

}
