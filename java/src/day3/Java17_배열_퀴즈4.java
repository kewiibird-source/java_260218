package day3;

import java.util.Arrays;
import java.util.Random;

public class Java17_배열_퀴즈4 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] arr = new int[6]; 
		int sam = 0;
		for(int i=0; i<arr.length; i++) { //i가 0일때부터 렝스보다 작으면 밑에부터실행하고 1증가
			arr[i] = ran.nextInt(45+1); // 0~44 +1 => 1~45의 랜덤한 숫자를 넣는다
				for(int j=0; j<i; j++) {
					if(arr[i] == arr[j]) {
						i--;
						break;
				}
			}		
		}
		System.out.println(Arrays.toString(arr)); // 6번돌고나서 배열안에있는 숫자 나열
	}

}
