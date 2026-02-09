package day9;

import java.util.HashMap;

public class Java02_Map {
	
	public static void main(String[] args) {
		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("java", 90);
		hong.put("oracle", 95);
		hong.put("html", 85);
//		얘도 toString이 오버라이딩 된 객체임 => 생략가능
		System.out.println(hong);
//		리스트는 [] 대괄호로 구분, 맵은 {} 중괄호로 구분
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("java", 95);
		kim.put("oracle", 80);
		kim.put("html", 65);
		System.out.println(kim.get("java"));
		System.out.println(kim);
	}

}
