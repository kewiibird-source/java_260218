package day2;

public class Java22_반복문키워드 {

	public static void main(String[] args) {
		// 반복문 빠져나가기 break 사용!
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			if(i == 5) {
//				break;
//			}
//		}
		
		// cuntinue는 곧바로 반복문의 증감식으로 이동
		// 5를 만나면 아래로 안내려감(프린트문실행x) 다시 i++로 6부터 실행됨
		for(int i=1; i<=10; i++) {
			if(i == 5) {
			continue;
			}
		System.out.println(i);
		}		
		
		
	}
}
