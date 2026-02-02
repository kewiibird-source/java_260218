package day4;

import java.util.Arrays;

public class Java03_문제풀이 {

	public static void main(String[] args) {
		// 배열에서 가장 큰 숫자와 가장 작은 숫자의 위치 바꾸기 결과 : {3, 1, 2, 4, 5};
		int[] arr = { 3, 5, 2, 4, 1 };
		int minIndex = 0;
		int maxIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		
		//Arrays.sort(arr); 배열안 데이터 정렬하기!!
		System.out.println(Arrays.toString(arr));
	}
}
