package day8;

public class Java02_Wrapper클래스 {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(10); 
		// 숫자를 객체로 만듬! => 여러가지 메소드 사용가능
		
		int a = i.parseInt("10"); //문자열로 된 숫자를 숫자(int)로 바꿔줌
		
		String num = "1234";
		System.err.println(Integer.parseInt(num));
		
		
	}

}
