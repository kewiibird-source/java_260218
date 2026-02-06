package day7;

import java.util.Arrays;
import java.util.Random;

public class Java98_문제풀이 {

	public static void main(String[] args) {
		// 1~30사이 숫자를 10개의 공간을 가지는 배열에 넣기
		Random ran = new Random();
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(30)+1;
//			
//			for(int j=0; j<arr.length; j++) {
//				int oddArr[]; //홀수들 
//				int evenArr[]; //짝수들
//				if(arr[i] % 2 == 0) {
//					evenArr[j] = i;
//				} else { 
//					
//			}
		}
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(oddArr));
//		System.out.println(Arrays.toString(evenArr));
		
		
		
		}
		
	}

