package day14;

public class Java06_복습_클래스2 {
	
	static void test(Person p) {
		
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p); // 이름 : 알수없음, 주소 : 알수없음
		
		Person p2 = new Person("홍길동"); 
		System.out.println(p2); // 이름 : 홍길동, 주소 : 알수없음
		
		Person p3 = new Person("김철수", "인천");
		System.out.println(p3.toString()); // 이름 : 김철수, 주소 : 인천
		
		Student s = new Student("박영희", "서울", 1234);
		test(s);
		System.out.println(s);
		
		Person s2 = new Student("유재석", "제주도", 9876);
	}

}
