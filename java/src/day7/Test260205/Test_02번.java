package day7.Test260205;

import java.util.Scanner;

public class Test_02번 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		while(true){			
			System.out.print("숫자 두개 입력 : ");
			int x = c.nextInt();
			int y = c.nextInt();
			if((x+y)<=10) {
				System.out.println("작은 수");
			}else {
				System.out.println("큰 수");
			}
		}
	}

}
