package day2;

import java.util.Scanner;

public class Java23_무한루프 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
				
		for(;;) {
			System.out.print("숫자를 입력해 주세요 : ");
			int input = s.nextInt();
			if(input < 1 || input > 100) {
				System.out.println("1부터 100사이의 값을 입력해주세요");
				} else if (input % 2 == 0 ) { 
					System.out.println("짝수 입니다.");
					break;
				} else {
						System.out.println("홀수 입니다.");
						break;
				}
		} // 홀짝 나오면 브레이크~

//		for(;;) {
//			System.out.println("몽스!"); 
//			} // 몽스 무한루프
			
//		int a = 1;
//		for(;;) {			
//			System.out.println(++a); 
//			if(a == 10) {
//				break;
//			}			
//		} // ++a for 10번째에서 탈출

		
	}
}
