package day2;

public class Java19_반복문퀴즈 {

	public static void main(String[] args) {
		// for + if 퀴즈
		// 1. 1부터 100까지 숫자 중 3의 배수만 출력
		// 1부터 100까지 출력 -> 3의 배수만 걸러진 것들만 출력하기..
		
//		for(int i=1; i<=100; i++) {
//			if(i % 3 == 0) {
//			System.out.println(i);
//			}	
//		}
		
		// 2. 10부터 1까지(역순) 숫자 출력
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
		
		// 3. 1부터 100까지 숫자 중 홀수들의 합과 짝수들의 각각의 합	
		// 홀수들만 출력 > 홀수들의 합 구하기
		int oddsum = 0; // 홀수합
		int evensum = 0; // 짝수합
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) { 
				oddsum += i;
			} else {
				evensum += i;
			}
		} 
		System.out.println("홀수 합 : " + oddsum);
		System.out.println("짝수 합 : " + evensum);
		
	}
}