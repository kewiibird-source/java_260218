package day4;

import java.util.Scanner;

public class Java02_배열_복습 {

	public static void main(String[] args) {
		// 배열 - 동일한 데이터 타입의 정보를 여러개 관리한다.
		// 다른 타입은 안됨! int면 int로 문자열이면 문자열.
		int[] arr = new int[5];
		// int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;

		// 스트링 배열
		String[] textArr = { "java", "oracle", "javascript", "html" };
//		for(int i=0; i<textArr.length; i++) {
//			System.out.println(textArr[i]);
//		}
//		위 아래 반복문은 결과가 같다!!
//		txt.length > 문자수 알려줌
		for(String txt : textArr) {
			System.out.println(txt.length());
		}

		Object[] test = { "z", 1, 1.5, true };
		// 오브젝트로 여러 타입의 데이터도 관리할 수 있따.
	}
}
