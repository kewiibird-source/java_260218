package day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Java09_복습3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		ArrayList<Object> list = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.println("암거나 입력 : ");
			String obj = a.next();
			list.add(obj);
		}
		String txt = (String) list.get(0);
		// Integer.parseInt(txt) 문자열로 된 숫자 "10"을 int형으로 변환해줌
		System.out.println(Integer.parseInt(txt)+ 1);
	}

}
