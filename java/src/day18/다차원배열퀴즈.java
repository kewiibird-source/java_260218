package day18;

import java.util.Arrays;
import java.util.Random;

public class 다차원배열퀴즈 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int arr[][] = new int[4][4];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {				
				arr[i][j] = r.nextInt(10)+1;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
//		int sum = 0; 
//		for(int i=0; i<arr.length; i++) {			
//			for(int j=0; j<arr[i].length; j++) {				
//				if(i == 0 || i == arr.length-1 || j == 0 || j == arr[i].length-1) {
//					sum += arr[i][j];
//				}
//			}
//		}
//		System.out.println(sum);
		
		
		
		int sum = 0; 
		for(int i=1; i<=2; i++) {			
				sum += arr[i][0];
				sum += arr[i][3];
		}
		System.out.println("arr[1], arr[2] 겉에숫자 합 : " + sum);
		
		int sum1 = 0; 
		for(int num : arr[0]) {
			sum1 += num;
		}
		System.out.println("arr[0] 배열 총합 : " + sum1);
		
		int sum2 = 0; 
		for(int num : arr[3]) {
			sum2 += num;
		}
		System.out.println("arr[3] 배열 총합 : " + sum2);
		
		System.out.println(sum+sum1+sum2);
		

		
	}

}
