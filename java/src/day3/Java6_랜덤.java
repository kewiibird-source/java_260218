package day3;

import java.util.Random;
import java.util.Scanner;

public class Java6_랜덤 {

	public static void main(String[] args) {
		// 랜덤한 숫자 가져오는 방법
		// Random 이라는 클래스 사용 / Math.class 도 있음
		// Random도 외부에서 가져오기 때문에 스캐너랑 똑같이 사용
		// ran.nextInt(); 는 int가 가질 수 있는 모든 범위의 숫자가 나옴
		// 범위정하기가 가능 1-10 중에서 나오게해줘
		// 컴퓨터는 0부터 카운트 해요 > 1부터 나오게 하고싶음 > +1, +2 하면된다
		// ran.nextInt(10);+1
		// 랜덤숫자는 반복문 안쪽에서 사용하기 -> 랜덤숫자 초기화가 안됨
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
//		int a = ran.nextInt(10);
//		int b = ran.nextInt(10)+1;
//		System.out.println(b);
		
		int x = ran.nextInt(8)+2; // 2~9
		int y = ran.nextInt(9)+1; // 1~9
		System.out.print(x + " * " + y + " = "); //랜덤 구구단 문제
		int answer = s.nextInt();
		if((x*y) == answer) {
			System.out.println("정답!");
		} else {
			System.out.println("오답!");
		}
	}

}
