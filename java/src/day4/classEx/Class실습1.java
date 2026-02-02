package classEx;

public class Class실습1 {

	public static void main(String[] args) {
		//hong 객체
		Human hong = new Human(); // Human형이라는 클래스 안에 데이터를 담는 hong이라는 이름의 변수를 선언
		hong.name = "홍길동";
		System.out.println(hong); // classEx.Human@33cb5951 (주소)
		System.out.println(hong.name); // 홍길동 출력
		
		hong.age = 30;
		System.out.println(hong.age); // 30 출력
		
		hong.eat(); // void eat
		
		String txt = hong.intro();
		System.out.println(txt);
		
		//kim 객체
		Human kim = new Human();
		System.out.println(kim.name); // null(빈 값) 출력
		kim.name = "김철수";
		System.out.println(kim.name); // 김철수 출력
		kim.speak();
	}

}
