package day5.classEx;

public class Student {
	// 변수(필드) + 메소드
	// 변수에 직접적으로 접근을 허용하게되면 캡슐화에 문제가 될 수 있음.
	// 접근하지 못하도록 막고, 메소드를 통해 접근하게 한다.
	String name;
	int age;
	String stuNo;
	int money; // 개인의 돈
	static int money_708 = 200000;// 708호 회비	

	Student() {
	} // 기본생성자

	// 3개의 변수를 초기화 하는 생성자
	Student(String name, int age, String stuNo) {
		this.name = name;
		this.age = age;
		this.stuNo = stuNo;
	}

	void study() {
		System.out.println(this.name + "(이)가 공부를 한다.");
	}

	void study(String subject) {
		System.out.println(subject + "(을)를 공부한다.");
	}

	String getStuNo() {
		return this.stuNo;
	}

}
