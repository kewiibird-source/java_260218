package day4.classEx;

public class Class실습2 {

	public static void main(String[] args) {
		Human hong = new Human("홍길동", 30, 170.5, true); // new 키워드
		hong.eat(); // 메소드 호출
		System.out.println(hong.name);
		String intro = hong.intro();
		System.out.println(intro);

		Human kim = new Human("김철수", 20, 180.5, false); 
		Human park = new Human("박영희", 25, 160.5, false); 
	}

}
