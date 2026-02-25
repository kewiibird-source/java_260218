package day18;

import java.util.Arrays;

public class 배열퀴즈 {

	public static void main(String[] args) {
		// 배열에서 두번째로 큰 값 찾기. 배열에는 중복된 숫자가 없다고 가정
		int arr[] = {3, 5, 2, 9, 4};
//		
//		for(int i=1; i<arr.length; i++) {
//			Arrays.sort(arr);
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[arr.length-2]);
		
		// 조건추가 => 배열의 모양을 변형시키지 않고 찾아라!
		int arr2[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i]; // 배열 복사
		}
		
		for(int i=1; i<arr.length; i++) {
			Arrays.sort(arr);
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr[arr.length-2]);
		
	}

}
