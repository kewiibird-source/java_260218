package day10;

import java.util.ArrayList;

public class Java03_리스트_객체 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>(); 
		
		Student hong = new Student("1234", "홍길동", 30); //객체생성
		hong.setJava(90);
		
		Student kim = new Student("9876", "김철수", 25); //객체생성
		kim.setJava(95);
		
		list.add(hong);
		list.add(kim);
		System.out.println(list); 
		// 객체 레퍼런스(주소)가 뜸 [day10.Student@49097b5d, day10.Student@6e2c634b]
		// toString 오버라이딩으로 [홍길동(1234)객체, 김철수(9876)객체]
	}

}
