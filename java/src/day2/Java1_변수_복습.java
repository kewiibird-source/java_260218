package day2;

public class Java1_변수_복습 {

	public static void main(String[] args) {
		System.out.println("주석은 실행에 영향을 주지 않는다.");
		// 자동 들여쓰기 => Ctrl + Shift + f
		
		String name = "홍길동"; // 스트링(문자열) 첫 스펠링은 대문자, 변수는 영어로 선언
		System.out.println(name); // 홍길동 출력
		System.out.println("name"); // name 출력
		// ""로 묶느냐 안묶느냐 => 문자열 구분
		
		int age = 30; // 정수
		double height = 170.5; // 실수
		boolean isMarride = true; // or false
		
		// 빨간색 에러 -> 명백한 오류 , 노란색 에러 -> 주의
		// 선언을 하면 저장공간을 차지하게 됨.
		// 선언하고 사용을 안하면 저장공간만 차지하게 돼 -> 노란색 오류 
		
		String gender; // 선언만 한 상태
		gender = "남자"; // String gender = "남자" 
		
//		int age = 25; 한번 선언한 변수는 재선언 할 수 없다.
//		int age 도 마찬가지.
		age = 31; // 변수 값 변경은 가능
		
	}// main

}
