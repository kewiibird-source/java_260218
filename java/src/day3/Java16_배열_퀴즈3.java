package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Java16_배열_퀴즈3 {

	public static void main(String[] args) {
		// 1. 5개의 공간을 가지는 배열을 선언
		// 2. 해당 배열에 숫자를 입력받아서 넣기
		// 3.1미만(0이하)의 숫자는 배열에 넣지 말고 다시 입력하도록
		
//		Scanner s = new Scanner(System.in); // 스캔
//		int[] ah = new int[5]; // 배열 5개짜리 선언	
//		for(int i=0; i<ah.length; i++) {
//			System.out.println("숫자를 입력하세요 : "); 
//			ah[i] = s.nextInt();
//		}
		
//		//무한루프사용
//		Scanner s = new Scanner(System.in);
//		int[] arr = new int[5];
//		int index = 0;
//		while(true) {
//			System.out.println((index+1) + "번째 숫자 입력 : ");
//			arr[index] = s.nextInt(); // arr[index] 값이 0이하 인지 체크필요
//			if(arr[index] < 1) {
//				System.out.println("1이상의 숫자를 입력해주세요");
//				continue; // 만나는순간 밑으로 안가고 맨위 코드로 다시감=> 음수 입력하면 맨위로 가서 숫자다시입력하라함
//			} else {
//				index++;
//			}
//			if(index == arr.length) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(arr));	
		
		//무한루프사용X
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1) + "번째 숫자 입력 : ");
			arr[i] = s.nextInt(); // arr[i]의 값(입력받은값)이 1보다 작냐를 체크해야함!
			if(arr[i] < 1) {
				System.out.println("1이상의 값을 입력해주세요.");
				i--; // 입력받은값이1보다 작을때 i값을 줄여서 다시 같은번째로 돌아오게함
			}
		}
	}
}
