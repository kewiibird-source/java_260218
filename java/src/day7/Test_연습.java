package day7;

import java.util.Random;
import java.util.Scanner;

public class Test_연습 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner n = new Scanner(System.in);

//		System.out.print("문제수를 입력해주세요 : ");
//		int t = n.nextInt();
//
//		int sum = 0;
//		for (int i = 0; i < t; i++) {
//			int r = ran.nextInt(9) + 1;
//			int a = ran.nextInt(9) + 1;
//			System.out.print(r + " * " + a + " = ");
//			int b = n.nextInt();
//			if (b == (r * a)) {
//				System.out.println("정답");
//				sum++;
//			} else {
//				System.out.println("오답. 정답은 " + (r * a) + "입니다.");
//				break;
//			}
//		}		
//		System.out.println("총"+t+"문제중"+sum+"정답!");
//		System.out.print("계속 하시려면 아무키를 입력해주세요. 종료는 0 입력");
		
		while(true) {
			int count = 0;
			System.out.println("문제수를 입력해주세요 : ");
			int num = n.nextInt();
			for(int i=0; i<num; i++) {
				int x = ran.nextInt(8)+2;
				int y = ran.nextInt(9)+1;
				System.out.print(x + " * " + y + " = ");
				int answer = n.nextInt();
				if((x*y) == answer) {
					System.out.println("정답!");
					count++;
				}else {
					System.out.println("오답! 정답은"+(x*y));
				}
			}
			System.out.println("총"+num+"문제중"+count+"정답!");
			System.out.print("계속 하시려면 아무키를 입력해주세요. 종료는 0 입력 : ");
			if(n.nextInt()==0) {
				break;
			}
		}
		System.out.println("종료!");
	}
}
