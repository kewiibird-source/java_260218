package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Java05_2차원배열문제 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		// 4x4 크기의 정수형 배열을 생성해서
		// 1~16 사이의 랜덤한 숫자를 넣기
		
		// 위에서 만든거에서 중복없이 넣는 코드로 변경
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int arr[][] = new int [4][4];
		for(int j=0; j<arr.length; j++) { // arr 전체크기 4			
			for(int i=0; i<arr[j].length; i++) { // j열의 크기 4
				arr[j][i] = ran.nextInt(16)+1;				
				if(list.contains(arr[j][i])) {
					i--;
					continue;
				}
				list.add(arr[j][i]);
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.println(Arrays.toString(arr[j]));
		}
		
	}

}
