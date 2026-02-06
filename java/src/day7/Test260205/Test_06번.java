package day7.Test260205;

import java.util.Arrays;
import java.util.Scanner;

public class Test_06번 {

	public static void main(String[] args) {
		/*6. 크기가 5인 int형 배열을 선언하고 사용자로부터 숫자를 입력받아서 5개의 값 넣기
		단, 0이하의 수를 입력하거나 중복된 숫자가 있으면 안내 문구를 출력 후 다시 입력 받을 것 
		=> 해당 조건이 어려우면 일단 5개 정상적으로 입력했다고 가정하고 진행하세요 */
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[5]; // {0,0,0,0,0}
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print((i+1)+" 번째 숫자 입력:");			
//			arr[i] = scn.nextInt(); // 넣은값이 순차적으로 배열에 들어감.
//			if(arr[i]<=0) { // (arr[i]<1)
//				System.out.println("1이상의 숫자를 입력하세요.");
//				i--;
//				}
//			}
//		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+" 번째 숫자 입력:");			
			arr[i] = scn.nextInt(); // 넣은값이 순차적으로 배열에 들어감.
			// 0이하의 수 체크
			if(arr[i]<=0) { // (arr[i]<1)
				System.out.println("1이상의 숫자를 입력하세요.");
				i--;
				continue;
			}
			// 중복값 체크
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("중복된 값이 있습니다. 다시 입력하세요");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		int oddsum = 0;
		int evensum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evensum += arr[i];
			} else {
				oddsum += arr[i];
			}
		}
		System.out.println("홀수 합 : " + oddsum);
		System.out.println("홀수 합 : " + evensum);
		System.out.println("차이 값 : " + Math.abs((oddsum - evensum)));
		}
	}
