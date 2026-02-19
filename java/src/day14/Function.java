package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Function {
	
	Function(){
		System.out.println("Function 객체를 생성했습니다.");
	}
	
	static int max(int x, int y) {
//		int z = x > y ? x : y;
//		return z;
		
		return x > y ? x : y;
	}
	
	int min(int x, int y) {
		return x < y ? x : y;
	}
	
	static int random(int x) {
		Random ran = new Random();
		return ran.nextInt(x)+1;
	}
	
	static int sum(int arr[]) {
		int add = 0;
		for(int i=0; i<arr.length; i++) {
			add += arr[i];
		}
//		향상된 for문
//		for(int num : arr) {
//			add += num;
//		}
		return add;
	}
	
	static int sort(int arr[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				list.add(arr[i]);
				arr[i] = -arr[i];
			}
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			arr[i] = list.contains(-arr[i]) ? -arr[i] : arr[i];
		}
		
		return 0;
	}
	
	
	
}
