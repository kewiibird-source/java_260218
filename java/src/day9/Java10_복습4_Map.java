package day9;

import java.util.HashMap;

public class Java10_복습4_Map {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("java", 90);
//		map.put("name", "홍"); value값이 Integer이기 떄문에 문자열 불가!
		
		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("height", 170.5);
		hong.put("isMarried", true);
		System.out.println(hong);
//		{isMarried=true, name=홍길동, age=30, height=170.5}
		
//		hong.put("height", 169.5);
		hong.put("height", (double)hong.get("height") - 1);
//		값 덮어쓰기도 가능!
		System.out.println(hong);
		
		
	}

}
