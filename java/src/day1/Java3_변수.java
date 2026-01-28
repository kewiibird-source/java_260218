package day1;

public class Java3_변수 {

	public static void main(String[] args) {
		
		String name;
		name = "홍길동";
		System.out.println(name);
		
		// 변수안에 들어간 값은 언제든 바꿀 수 있다... 이어서
		String hobby = "영화감상";
		System.out.println(hobby); // 영화감상 출력
		
		hobby = "코딩";
		System.out.println(hobby); // 코딩 출력
		
		// 변수 선언은 한번만 가능
		int age = 30;
		age = 20; // age 안의 값(내용) 변경
//		int age = 20; 이건 재선언이기 때문에 X
		

	}

}
