package day5;

import java.util.Arrays;

public class Java05_버블정렬2 {

	public static void main(String[] args) {
		// 버블정렬
		// 인접한 숫자끼리 비교해서 큰 숫자를 뒤로 보낸다.
		int arr[] = { 2, 4, 5, 1, 3 };
		
		for (int j = 1; j < 5; j++) {
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
