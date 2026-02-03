package day4.classEx;

public class Human {
	// 객체 변수(필드)영역
	String name;
	int age;
	double height;
	boolean isMarried;

	// 생성자 : 클래스 이름이랑 동일한 이름의 메소드!!
	// 따로 선언 안하면 기본으로 하나 만들어 짐
	// 생성자는 리턴(void) 무조건 없다.
	// 객체 만들 때 꼭 한번 실행 된다.
	// 객체를 초기화 하는 용도로 사용한다.
	// 생성자도 같은이름으로 또 만들 수 있음! => 오버로딩
	Human() {
	}
	// a,b,c,d 로 구별하면 구분이 안되니까 this를 붙여서 구분함.
	// ()안에 들어가는 것들 인자값, 매개변수, 파라미터
	Human(String name, int age, double height, boolean isMarried) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.isMarried = isMarried;

//	Human(String a, int b, double c, boolean d) {
//		name = a;
//		age = b;
//		height = c;
//		isMarried = d;
//		System.out.println("생성자 호출!");
	}

	// 메소드 영역
	void eat() {
		System.out.println("밥먹었다!");
	}

	void speak() {
		System.out.println("말했다! 안녕?");
	}

	String intro() {
		return "이름은 " + name + ", 나이는" + age;
	}

}
