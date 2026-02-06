package day7.Test260205;

import java.util.Random;
import java.util.Scanner;

public class Test_04번 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random ran = new Random();
		while(true) {
			System.out.print("숫자 입력 : ");
			int sn = scn.nextInt();
			int rd = ran.nextInt(99)+1;
			if(sn > rd) {				
				System.out.println("랜덤숫자 : "+rd);
				System.out.println("입력한 수가 더 큽니다.");
			} else {
				System.out.println("랜덤숫자 : "+rd);
				System.out.println("랜덤한 수가 더 큽니다.");
			}
		}
	}
}
