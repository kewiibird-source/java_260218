package day4;

public class Java05_메소드2 {

	static void method1() {
		// 리턴이 없는 메소드. (1)번 메소드 형태
		System.out.println("첫번째 메소드 호출!!");
		// 나에게 필요한 기능을 정의할 수 있음!
		// void => 되돌려주지 않음을 선언한것
	}

	static int method2() {
		// 리턴이 있는 메소드. (2)번 메소드 형태
		return 100;
		// int를 되돌려주겠다고 선언한것,
		// 문자나 문자열 다른 타입의 데이터는 넣을 수 없음.
	}
	
	static int sum(int a, int b) {
		return a+b;
//		int c = a+b;
//		return c;
	}

	public static void main(String[] args) {
		// 메소드의 형태 두가지
//		 1)단순히 호출하고 끝나는 형태
//		System.out.println("ㅋㅋ");
//		 2)결과를 되돌려주는 형태
//		int a = Math.max(10, 15);
//		System.out.println(a);

		method1(); // 메소드를 호출할때 메소드뒤에 괄호 붙이면 됨
		int value = method2(); // 100을 되돌려 받는다
		System.out.println(value);
		
		int result = sum(3,5); // 괄호안에 있는 2개숫자를 더해서 리턴
		System.out.println(result);
		int result2 = sum(100, 200); 
		System.out.println(result2);
	}

}
