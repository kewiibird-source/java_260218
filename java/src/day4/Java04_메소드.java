package day4;

import java.util.Random;
import java.util.Scanner;

public class Java04_메소드 {

	public static void main(String[] args) {
		// 객체 => 변수 + 메소드
		// 사람이라는 객체
		// 이름, 나이, 성별, 주소, 전화번호.. => 정보는 변수에 저장
		// 공부한다, 밥먹는다, 걷는다, 전화한다.. => 행동들은 메소드에 저장
		// 메소드 = 함수
		
		// 메소드는 괄호()가 붙는다. 스캐너도, 랜덤도 메소드가 맞긴함
		System.out.println();// println 메소드
		Scanner s = new Scanner(System.in);
		s.nextInt(); // nextInt 메소드
		Random ran = new Random();
		ran.nextInt(); // nextInt 메소드
	}

}
