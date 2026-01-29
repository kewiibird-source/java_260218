package day2;

public class Java4_연산자 {

	public static void main(String[] args) {
		// 코딩에서는 사칙연산 외에도 나머지 연산(%)이 많이 활용된다.
		int a = 10;
		int b = a % 3; // 10을 3으로 나누고 나머지 값 = 1
		System.out.println(b); // b는 1
		
		String name = "홍길동";
		int age = 30;
		System.out.println(name+age); // 홍길동30 출력
		// 문자와 다른 데이터 타입을 더하기 하면 이어 붙이는 형태가 됨.
		// 문자는 더하기(+)(이어 붙이기)만 가능함
		
		System.out.println(name+age);
		System.out.println(name+"의 나이는 "+age+"살 입니다");
		// => 홍길동의 나이는 30살 입니다
		System.out.println(name+"의 나이는 "+age+1+"살 입니다");
		// => 홍길동의 나이는 301살 입니다 => 앞에서 이미 문자열이기 때문에 301이 됨 
		System.out.println(name+"의 나이는 "+ (age+1) +"살 입니다");
		// => 홍길동의 나이는 31살 입니다 => 먼저 계산하고 싶다면 ()로 묶어주기!
		


	}

}
