package day10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java04_성적관리 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		// 3명의 학생을 list에 추가
		// 학번, 이름, 나이를 입력받아서 Student 객체로 만들고 list에 추가
		Scanner n = new Scanner(System.in);
		
		try {
			for(int i=0; i<3; i++) {			
				System.out.print("학번 입력 : ");
				String stuNo = n.next();
				
				System.out.print("이름 입력 : ");
				String name = n.next();
				
				System.out.print("나이 입력 : ");
				int age = n.nextInt();
				
//			Student stu = new Student(stuNo, name, age);
//			list.add(stu);
				list.add(new Student(stuNo, name, age));
			}
			
		} catch (InputMismatchException e) {
			System.out.println("숫자 입력하셈");
			n.next();
		}
		
		
		System.out.println(list);
		}
		
		
	}


