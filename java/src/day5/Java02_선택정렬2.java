package day5;

import java.util.Arrays;

public class Java02_선택정렬2 {

	public static void main(String[] args) {
		// 1.01선택정렬 에서 작성한 코드의 규칙성을 찾아서
		// 반복문으로 다시 작성해보기
		int arr[] = { 2, 3, 5, 1, 4 }; // 배열크기의 -1번만큼 비교햐ㅑㅐ

		for (int j = 0; j < arr.length-1; j++) {
			int minIndex = j;
			for (int i = j + 1; i < arr.length; i++) { // j가 0일떄 밑으로 내려가서 i는 1
				if (arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			int temp = arr[j];
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
}
