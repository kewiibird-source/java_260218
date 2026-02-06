package day8;

import java.util.Scanner;

public class Java04_subString {

	public static void main(String[] args) {
//		String text = "Hello Java";
//		String java = text.substring(6);
//		System.out.println(java);
		
		
//		String hello = text.substring(0, 5); // 뒤에 숫자는 5 전까지 라는 의미
//		System.out.println(hello);
		
		Scanner n = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String a = n.next(); // java
		for(int i=0; i<a.length(); i++) { 
			a = a.substring(1) + a.substring(0, 1);
			System.out.println(a);
		}
			
	}

}
