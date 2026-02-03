package day5;

import java.util.Arrays;

public class Java03_선택정렬3 {

	public static void main(String[] args) {
		// 내림차순 { 5, 4, 3, 2, 1 }으로 만들기
		int arr[] = { 2, 3, 5, 1, 4 };

		for (int i = 0; i < arr.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
}
