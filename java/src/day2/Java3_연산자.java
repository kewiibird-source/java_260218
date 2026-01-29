package day2;

public class Java3_연산자 {

	public static void main(String[] args) {
		
		// 수학에서 사용하는 사칙연산(+,-,*,/)사용
		int a = 10;
		int b = 5;
		int c = 13;
		System.out.println(a+b); // => 15
		System.out.println(c-b); // => 8
		System.out.println(a*c); // => 130
		System.out.println(c/b); // => 2 (2.6에서 강제형변환!)
		// 사칙연산의 결과는 더 큰 데이터 타입을 따른다.
		// int와 int의 계산이므로 결과도 int형으로 나옴.(나머지값 사라짐)
		
		double d = 13;
		System.out.println(d/b); // => 2.6
		// int와 double의 계산이므로 결과는 double형으로 나옴
		System.out.println((double)c/b); // => 2.6
		// 더블형으로 바꿀랭 => 2.6
		

	}

}
