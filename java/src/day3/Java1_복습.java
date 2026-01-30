package day3;

public class Java1_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		System.out.println(a / b);//사칙연산은 더 큰 데이터 타입을 따른다.=>3
		double c = 3;
		System.out.println(a / c);//더블형>인트형 => 3.333....(실수)
		System.out.println((double)a / b);//인트형을 더블형으로 강제로 바꿈 => 3.333...
		
		String name = "홍길동";
		int age = 30;
		System.out.println(name + "의 나이는 "+ age);
		//문자열의 사칙연산은 +만 가능하며, 이어붙이기가 된다.
		
		int num = 10;
		num = num + 3;
		num += 3; // 내가 가진 숫자(10)에 3을 더한 후의 값
		
		int x = 10;
		int y = x++; // y안에 x값(10)을 먼저 넣고 x증가(11)
		int z = --x;
		// x=10, y=10, z=10
		
		System.out.println(x > y); // false
		System.out.println(x >= y); // true
		System.out.println(z > 5); // true
		
		System.out.println(x = z); // 오른쪽 값을 왼쪽값에 넣겠다
		System.out.println(x == z); // 같냐? true
		System.out.println(x != z); // 다르냐? false
		
		System.out.println(x > 5 && y > 8); 
		// &가 두개인 이유: 왼쪽결과가 false이면 뒤엣값은 도출하지 않음
		System.out.println(x > 15 || y > 8); // true
	}

}
