package day7.Test260205;

import java.util.Arrays;
import java.util.Scanner;

public class Test_07번 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+" 번째 숫자 입력:");
			arr[i] = scn.nextInt();
			if(arr[i]<=0) {
				System.out.println("0이상의 숫자를 입력하세요.");
				i--;
				}
			if(arr[i] % 2 == 0) {
				
			}
			}
		System.out.println(Arrays.toString(arr));
		
	}

}
