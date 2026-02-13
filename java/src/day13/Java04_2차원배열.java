package day13;

import java.util.Arrays;

public class Java04_2차원배열 {

	public static void main(String[] args) {
		int arr[][] = new int [3][5]; // 3행5열
		int arr2[][] = {{5,4,3,2,1},{6,7,8,9,10},{11,22,33,44,55}};
		
//		System.out.println(arr2[0][2]);
//		System.out.println(Arrays.toString(arr2[0]));
		
		// arr2.length 는 전체크기를 의미! => 3개
//		for(int i=0; i<arr2[0].length; i++) {
//			System.out.print(arr2[0][i] + " ");
//		}
//		System.err.println();
//		for(int i=0; i<arr2[1].length; i++) {
//			System.out.print(arr2[1][i] + " ");
//		}
//		System.err.println();
//		for(int i=0; i<arr2[2].length; i++) {
//			System.out.print(arr2[2][i] + " ");
//		}
		
		for(int j=0; j<arr2.length; j++) {			
			for(int i=0; i<arr2[j].length; i++) {
				System.out.print(arr2[j][i] + " ");
			}
			System.out.println();
		}
		
		for(int array[] : arr2) {
			for(int num : array) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	}

}
