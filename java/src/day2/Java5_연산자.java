package day2;

public class Java5_연산자 {

	public static void main(String[] args) {
		// 대입 연산자
		
		int a = 10;
		int b = 5;
		
//		a = a+b;
		a += b; // 내가 갖고있는 값에(a) 오른쪽 값을(b) 더한 값이 a라고 할게
		System.out.println("a+=b=> " + a); // => 15

		b -= 3; // b = b-3; 
		System.out.println("b-=3=> " + b); // => 2

		a *= 2;
		System.out.println(a); // => 30
		
		
	}

}
