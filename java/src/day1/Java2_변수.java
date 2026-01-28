package day1;

public class Java2_변수 {

	public static void main(String[] args) {
		
		// 변수는 정보를 담는 공간이다.
//		이름 : 홍길동 => 문자열은 string, 값을 담을 때는 equal(=)을 사용
		String 이름 = "홍길동";
		System.out.println(이름); // "홍길동" 출력
		System.out.println("이름"); // "이름" 출력
		
//		나이 : 30 => 정수는 int로 표현
		int 나이 = 30;
//		정수는 int(4bt) or long(8bt), int는 -21억 ~ 21억 까지 표현할때, 이상이면 long
		System.out.println(나이);
		
//		성별 : 남자
		String 성별 = "남자";
		System.out.println(성별);
		
//		결혼여부 : true or false
		boolean 결혼여부 = true; // or false
		
//		키 : 170.5 => 실수(소수점 있는 숫자)는 double
		double 키 = 170.5;
		System.out.println(키);
		
		// 1. 변수는 변수이름 앞에 데이터 타입이 붙어야 한다.
		// 2. [문자 : String], [정수 : int], [실수 : double], [참,거짓 : boolean]
		// char, byte, float 등도 있다...
		// String은 사실 클래스다 .... 변수 데이터 타입이 아님 ... 그래서 색도 다름
		
		// 변수명은 호환성의 문제로 영어로 적어야함. 또한 직관적으로.
		String name = "홍길동";
		int age = 30;
		double height = 170.5;
		boolean ismarried = false;
		
		// 변수명의 첫글자는 소문자 : 카멜(camel) 표기법 권장 - 가독성을 위한 약속
		// 클래스인지 변수인지 구분하기 어려움.
		// 카멜표기법은 2개이상의 단어가 ^조합^되었을 때, 두번째 단어부터 첫글자를 대문자로 한다.
		// ex) 학번(student + number) => studentNumber or stuNumber
		
		String gender; // 변수 선언
		gender = "남자"; // 값 초기화
		
		String gender2 = "여자"; // 변수 선언과 동시에 초기화
		
		// 변수안에 들어간 값은 언제든 바꿀 수 있다.
		
	}// main

}
