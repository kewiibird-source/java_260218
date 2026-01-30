package day3;

import java.util.Arrays;

public class Java14_배열_퀴즈 {

	public static void main(String[] args) {
		// 1. 가장 큰 숫자의 위치 값(index) 찾기
		
		int[] arr = {5, 3, 8, 4, 2};
		int maxIndex = 0; // 큰 숫자의 위치 백업용
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		} System.out.println(maxIndex);
	}
}
