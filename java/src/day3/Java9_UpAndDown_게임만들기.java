package day3;

import java.util.Random;
import java.util.Scanner;

public class Java9_UpAndDown_게임만들기 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int random = ran.nextInt(100)+1; //1부터100까지 숫자중 랜덤
		int count = 1; //시도하는횟수 변수선언
		while(true) {
			System.out.println(count + "번째 시도 : ");
			int answer = s.nextInt(); // 사용자 답변 변수! answer
			// if(answer < 1 || answer) 1보다 작거나, 100보다 클때.
			if(!(answer >= 1 && answer <= 100)) { //1부터100까지 숫자가 아닐때. !(~)
				System.out.println("1~100 사이의 값을 입력해주세요.");
			} else if(random > answer) { //랜덤값이 더 클때 up출력
				System.out.println("UP!");
				count++; // 출력후 카운트 추가
			} else if(random < answer) { // 랜덤값이 더 작을때 DOWN출력
				System.out.println("DOWN!");
				count++; 
			} else { // 받은값 answer이 랜덤값과 같을때
				System.out.println("정답입니다!" + count + "번째만에 맞추셨습니다.");
				break;
			}
		}
		
	}

}
