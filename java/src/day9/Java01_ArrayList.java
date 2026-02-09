package day9;

import java.util.ArrayList;

public class Java01_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);	
		list.add(5);	
		list.add(9);
		System.out.println(list.toString());
		// 배열은 list만 적었을때 주솟값이 나와야하지만
		// toString을 오버라이딩 해서! 생략가능함

		ArrayList<Object> list2 = new ArrayList<Object>();
//		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("히히");
		list2.add(123);
		list2.add(true);
		list2.remove(1);
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
	}

}
