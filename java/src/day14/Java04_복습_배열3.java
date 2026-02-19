package day14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Java04_복습_배열3 {

	public static void main(String[] args) {
		Random ran = new Random();
		// 랜덤한 숫자 1~10까지 arr배열에 넣기.
		// 중복된 숫자는 2개까지만 허용
		HashMap<Integer, Integer> num = new HashMap<>();
		for(int i=1; i<=10; i++) {
			num.put(i, 0);
		}
		
		int arr[] = new int[15];
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(10)+1;
			if(num.get(arr[i]) <= 2) {				
				num.put(arr[i], num.get(arr[i]+1));
			} else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));

		
		System.out.println(num);
	}

}
