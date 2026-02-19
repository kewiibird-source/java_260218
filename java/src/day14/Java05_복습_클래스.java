package day14;

import java.util.Arrays;

public class Java05_복습_클래스 {

	public static void main(String[] args) {
		int max = Function.max(3,5);
		System.out.println("1. " + max); // 5
		
		Function func = new Function(); // 'Function 객체를 생성했습니다.'
		int min = func.min(3,5);
		System.out.println("2. " + min);
		
		int ran = Function.random(10);
		System.out.println("3. " + ran); // 1부터 10(인자값)사이의 랜덤한 값 출력
		
		int arr[] = {3, 5, -4, 10, -9};
		int sum = Function.sum(arr);
		System.out.println("4. " + sum); // 배열안에 있는 모든 숫자의 합
		
		Function.sort(arr);
		// 음수, 양수 상관없이 내림차순으로 
		System.out.println(Arrays.toString(arr)); // {10, -9, 5, -4, 3}
		
	}

}
