package day9;

import java.util.ArrayList;
import java.util.Scanner;

public class Java08_복습2 {

	public static void main(String[] args) {
		// 인덱스값을 넣지 않아도 됨.

		ArrayList<Integer> list = new ArrayList<>();
		// 숫자를 입력받아서 6개 저장, 숫자의 범위는 1~30 사이.
		// 그 외의 값 입력 시 다시 입력하도록
		Scanner n = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 : ");
			int a = n.nextInt();
			if (a < 1 || a > 30) {
				i--;
				System.out.println("1~30 사이의 숫자를 입력");
				continue;
			} else {
				list.add(a);
			}
		}
		System.out.println(list);
		ArrayList<Integer> oddList = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
//			if()
			oddList.add(list.get(i));
		}
		System.out.println(oddList);
	}
	

}
