package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Java12_배열_array3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5]; //배열 5크기짜리 만들거임
	
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");			
			arr[i] = s.nextInt(); // 입력받은숫자로 배열에 넣기
		}
		System.out.println(Arrays.toString(arr));

		// 입력받은 5개의 숫자의 평균을 구하기
		// 배열안에 있는 모든 값의 평균
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("평균 값 : " + ((double)sum/arr.length));
	}

}
