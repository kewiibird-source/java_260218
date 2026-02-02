package day3;

import java.util.Arrays;

public class Java19_과제 {

	public static void main(String[] args) {
		// 배열에서 가장 큰 숫자와 가장 작은 숫자의 위치 바꾸기 결과 : {3, 1, 2, 4, 5};
		// 버블정렬 선택정렬 알아오깅
		int[] arr = { 3, 5, 2, 4, 1 };
		int max = 0;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
			if (arr[i] < arr[min]) {
				min = i;
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		int temp = arr[1];
		arr[1] = arr[4];
		arr[4] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
