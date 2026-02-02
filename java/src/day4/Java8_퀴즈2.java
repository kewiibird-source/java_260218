package day4;

import java.util.Arrays;
import java.util.Random;

public class Java8_퀴즈2 {

	public static void main(String[] args) {
		// 랜덤한 숫자 10개를 arr 배열에 넣기
		// *랜덤 숫자 범위는 1~20
		// *홀수와 짝수의 개수는 무조건 5개씩
		// *중복허용
		Random ran = new Random();

		int arr[] = new int[10];
		int oddcnt = 0;
		int evencnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int random = ran.nextInt(20) + 1;
			if (random % 2 == 1) {
				if(oddcnt == 5) {
					i--;
					continue;
				}
				oddcnt++;
			} else {
				if(evencnt == 5) {
					i--;
					continue;
				}
				evencnt++;
			} 
			arr[i] = random;
		}
		System.out.println(oddcnt);
		System.out.println(evencnt);
		System.out.println(Arrays.toString(arr));
	}

}
