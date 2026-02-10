package day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java02_예외처리 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int number  = 10;
		
		//try에서 예외가 여러개이다? 그럼 catch 늘리셈 
		// => 장점 : 명확한 오류 메세지를 줄 수 있음
		// => 단점 : 귀찮음
//		try {
//			System.out.print("나누는 수를 입력 : ");
//			int divisor = n.nextInt();
//			System.out.println(number/divisor);			
//		} catch (ArithmeticException e) {
//			System.out.print("0으로 나누지 마셈 ");
//			System.out.print(e.getMessage());
//		} catch (InputMismatchException e) {
//			// TODO: handle exception
//			System.out.println("숫자 입력해라");
//		}
		
		// 모든 예외는 Exception를 상속받음
		// => 장점 : 편함
		// => 단점 : 명확한 오류 메세지를 줄 수 없음
		// 문자열을 입력해도 ArithmeticException 오류 메세지가 뜸.
		try {
			System.out.print("나누는 수를 입력 : ");
			int divisor = n.nextInt();
			System.out.println(number/divisor);			
		} catch (Exception e) {
			System.out.print("0으로 나누지 마셈 ");
			System.out.println("숫자 입력해라");
		}
		
		
		
		
		
	}

}
