package day9;

import java.util.ArrayList;
import java.util.HashMap;

public class Java11_복습5_listmap {

	public static void main(String[] args) {
		// arraylist<데이터타입> => Integer, String, HashMap
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		HashMap<String, Object> hong = new HashMap<>(); // hong의 주소는 abcd (레퍼런스 관계)
		list.add(hong); // list 안에 map을 넣었다. = hong의 주소인 abcd를 가르키는 것 => 순서 중요 X
		
		hong.put("name", "홍길동");
		hong.put("age", 30);
		System.out.println(list);
		// [{name=홍길동, age=30}]
		
		HashMap<String, Object> map = list.get(0);
		map.put("age", 31);
		System.out.println(hong);
		// {name=홍길동, age=31}
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("addr", "인천");
		list.add(kim);
		System.out.println(list);
		
	}

}
