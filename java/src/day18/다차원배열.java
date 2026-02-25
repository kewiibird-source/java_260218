package day18;

import java.util.Arrays;
import java.util.Random;

public class 다차원배열 {

	public static void main(String[] args) {
		int arr[][] = new int[3][5]; // 5개의 공간을 가지는 배열이 3개
//		System.out.println(Arrays.toString(arr[0]));
//		System.out.println(Arrays.toString(arr[1]));
//		System.out.println(Arrays.toString(arr[2]));
//		{
//			[0, 0, 0, 0, 0]
//			[0, 0, 0, 0, 0]
//			[0, 0, 0, 0, 0]
//		}
		
		// 배열의 0번째 열에 순차적으로 숫자 넣기
//		for(int i=0; i<arr[0].length; i++) { // 그냥 arr.length를 하면 3이나옴!!
//			arr[0][i] = i+1; 
//		}
//		System.out.println(Arrays.toString(arr[0]));
//	}
		
		// 모든 배열에 랜덤한 숫자 1~10 넣기
		Random r = new Random();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {				
				arr[i][j] = r.nextInt(10)+1;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		// 합의 결과는 모두 다르다고 가정하고, 랜덤한 값이 들어간 배열의 총 합이 제일 큰 배열은?
		int index = 0;
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			int sum = 0; // i가 증가될때마다 sum 초기화
			for(int j=0; j<arr[i].length; j++) {				
				sum += arr[i][j];
			}
			if(max < sum) {
				max = sum;
				index = i;
			}
			System.out.println(sum);
		}
		System.out.println(Arrays.toString(arr[index]));
	}

}
