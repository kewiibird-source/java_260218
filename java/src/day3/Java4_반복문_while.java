package day3;

public class Java4_반복문_while {

	public static void main(String[] args) {
		// for(선언부; 조건식; 증감식)
		// while(조건), 선언은 밖, 증감은 안
		// for(int i=1; i<=10; i++)
		
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int i=1;
//		while(i<=10) {
//			i++;
//			System.out.println(i);
//		} 
//		출력보다 증감을 먼저 적으면 10까지 출력되어야 하는데 11까지 출력됨

		// 1. while문으로 구구단 찍기
//		int i=1;
//		while(i<=9) {
//			i++;
//			System.out.println("=== "+i+" 단===");
//			
//			int j=1;
//			while(j<=9) {
//				System.out.println(i+" * "+j+" = "+(i*j));
//				j++;
//			}
//		}
		
		int i=2;
		while(i<=9) {
			System.out.println("=== "+i+" 단===");
			int j=1;
			while(j<=9) {
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;				
			} 
			i++;
		} 
	}
}
