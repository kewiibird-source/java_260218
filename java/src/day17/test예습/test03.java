package day17.test예습;

import java.util.Arrays;
import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
//		 3. 6개의 공간을 가지는 int형 배열을 생성하고 스캐너를 통해 아래 조건에 맞게 숫자를 입력받아서 배열의 모든 공간에 넣으시오.
//		 - 조건1. 배열에 들어가는 숫자는 1부터 100사이의 숫자일 것
//		 - 조건2. 5의 배수는 넣지 말 것.
//		( 결과 화면 캡처 및 첨부 )
		
		Scanner n = new Scanner(System.in);
		int arr[] = new int[6];
		
		for(int i=0; i<arr.length; i++) {	
			System.out.print((i+1) + "번째 숫자를 입력하셈 : ");
			int input = n.nextInt();
			if(input < 1 || input > 100) {
				System.out.println("1부터 100 사이의 숫자를 입력하셈");
				i--;
			} else if(input % 5 == 0) {
				System.out.println("5의 배수는 넣지 마셈");
				i--;
			} else {
				arr[i] = input;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
