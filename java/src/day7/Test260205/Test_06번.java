package day7.Test260205;

import java.util.Arrays;
import java.util.Scanner;

public class Test_06번 {

	public static void main(String[] args) {
		/*6. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
		단, 0이하의 수를 입력하거나 중복된 숫자가 있으면 안내 문구를 출력 후 다시 입력 받을 것 
		=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 가정하고 진행하세요 */
		//중복된 숫자 체크는 모르겠어서 넘어갔습니다
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+" 번째 숫자 입력:");
			arr[i] = scn.nextInt();
			if(arr[i]<=0) {
				System.out.println("0이상의 숫자를 입력하세요.");
				i--;
				}
			}
		System.out.println(Arrays.toString(arr));
		}
	}
