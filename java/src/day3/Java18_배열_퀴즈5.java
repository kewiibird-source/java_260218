package day3;

import java.util.Arrays;

public class Java18_배열_퀴즈5 {

	public static void main(String[] args) {
		//값의 위치를 바꾸고 싶을때
		int[] arr = {3, 5, 2, 4, 1};
//		arr[0] = arr[2]; // {2, 5, 2, 4, 1}
		
		int temp = arr[0]; // 0번째 숫자를 temp에 백업함
		arr[0] = arr[2]; // {2, 5, 2, 4, 1}
		arr[2] = temp; // {2, 5, 3, 4, 1}
		System.out.println(Arrays.toString(arr));
		
	}

}
