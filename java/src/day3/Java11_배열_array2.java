package day3;

import java.util.Arrays;

public class Java11_배열_array2 {

	public static void main(String[] args) {
		//배열 선언 먼저 한 후 나중에 값을 넣기도 됨
		//배열은 고정크기를 지정해줘야 한다.
		
		int[] arr = new int[5]; // int[] arr = {0,0,0,0,0} // 5개 공간을 가지는 배열이 된다.
//		arr[0] = 10; // {10,0,0,0,0} 
//		arr[3] = 50; // {10,0,0,50,0} 
		
		
		for(int i=0; i<arr.length; i++) { // arr.length는 총 배열의 크기만큼
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr)); // 어레이 안 전체 배열을 문자열로 나열
		

	}

}

