package day5;

import java.util.Arrays;

public class Java07_인자전달 {
	
	static void valueMethod(int x) {
		x += 1;
	}
	
	public static void main(String[] args) {
		int a = 3;
		valueMethod(a);
		System.out.println(a);
		
		int x = 10;
		int y = x;
		x = 15;
		System.out.println(y); // 10

		// arr1에 대한 주소를 arr2에게 주는것. 같은주소
		int arr1[] = {1,2,3,4,5};
		int arr2[] = arr1; 
		arr1[0] = 10000;
		System.out.println(Arrays.toString(arr2));
	}

}
