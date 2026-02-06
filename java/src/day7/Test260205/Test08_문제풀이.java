package day7.Test260205;

import java.util.Random;
import java.util.Scanner;

public class Test08_문제풀이 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		while(true) {
			System.out.print("[1. 구구단 풀기, 2. 종료] : ");
			int menu = s.nextInt();
		if(menu == 1) {
			// 구구단 풀기
			while(true) {				
				System.out.print("[1. 쉬움(2~5단), 2. 보통(6~9단), 3. 어려움(12~19단)] : ");
			menu = s.nextInt();
			if(menu >=1 && menu<=3) {
				//구구단 시작
				int count = 0;
				for(int i = 1; i <= 5; i++) { // 문제수 5개로 정해져있으니까 i<=5
					int x; // x는 난이도 메뉴선택에 따라 달라져야함.
					if(menu ==1) {
						x = ran.nextInt(4)+2; // 2~5
					} else if(menu ==2) {
						x = ran.nextInt(4)+6; // 6~9
					} else {
						x = ran.nextInt(8)+12; // 12~19
					}
					int y = ran.nextInt(9)+1; // y는 고정!
					System.out.print(i + "번 " + x + " * " + y + " = ");
					int answer = s.nextInt(); // 값 입력 받고
					if(answer == x*y) { 
						System.out.println("정답!");
						count++;
					} else {
						System.out.println("오답! 정답은" + (x*y)+"입니다.");
					}
				}
				System.out.println("총 "+count+"개 맞췄음");
				break; // 5문제 다 풀었으니까 더이상 진행 안해도됨 메뉴로 돌아감
			} else { // 난이도 고를때 1~3이 아니면?
				System.out.println("난이도는 1~3중에 선택하셈");
			}
			} // while문 끝
		} else if(menu == 2) {
			// 종료
			System.out.println("종료됨.");
			break;
		} else {
			// 1,2 번호가 아닐시 다시입력
			System.out.println("1~2중에 선택하셈");
		}
		}
	}

}
