package day3;

import java.util.Random;
import java.util.Scanner;

public class Java9_UpAndDown_게임만들기 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int random = ran.nextInt(100)+1;
		int count = 1; //시도하는횟수
		while(true) {
			System.out.println(count + "번째 시도 : ");
			int answer = s.nextInt();
			// answer < 1 || answer > 100
			if(!(answer >= 1 && answer <= 100)) {
				System.out.println("1~100 사이의 값을 입력해주세요.");
			} else if(random > answer) {
				System.out.println("UP!");
				count++;
			} else if(random < answer) {
				System.out.println("DOWN!");
				count++;
			} else {
				System.out.println("정답입니다!" + count + "번째만에 맞추셨습니다.");
				break;
			}
		}
		
	}

}
