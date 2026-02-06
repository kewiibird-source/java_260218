package day7;

import java.util.HashMap;

public class Java03_toString {

	public static void main(String[] args) {
		Person hong = new Person("홍길동",30);
		Person hong2 = new Person("홍길동",30);
//		System.out.println(hong.toString()); //toString은 생략가능
		System.out.println(hong);
		System.out.println(hong == hong2); // false 각각 다른 주소, 각각 독립적인 객체.
		System.out.println(hong.equals(hong2)); //equals 오버라이딩
		
		
		String a = new String("test");
		String b = new String("test");
		
		System.out.println(a==b);
		System.out.println(a.equals(b)); // true!
		
		String str = new String("zz");
//		System.out.println(str.toString()); // 생략가능
		System.out.println(str);
		
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "홍길동");
//		map.put("java", 100);
//		map.put("isMarried", true);
//		System.out.println(map);
	}

}
