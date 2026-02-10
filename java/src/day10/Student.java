package day10;

import java.util.Scanner;

public class Student {
	static Scanner n = new Scanner(System.in);
	private String stuNo; // 데이터를(학생) 구분하는 고유한 값이 필요함
	private String name;
	private int age;

	private int java;
	private int oracle;
	private int html;
	
	
	public Student() {}
	
	public Student(String stuNo, String name, int age) {
		this.stuNo = stuNo;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
//		String info = "{stuNo=" + this.stuNo + ", name=" + this.name + ", age=" + this.age + ", java=" + this.java + ", oracle=" + this.oracle + ", html=" + this.html + "}"; 
		return this.name + "(" + this.stuNo + ")" + "객체";
//		return info;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		if(java < 0 || java > 100) {
			System.out.println("시험 점수의 범위는 0부터 100입니다.");
			return; // 리턴 만나면 메소드 끝내기 => 잘못입력하면 다음으로 넘어가버림
		}
		this.java = java;
	}
	
	public void setJava() {
		while(true) {			
			System.out.print("자바 : ");
			int java = n.nextInt();
			if(java < 0 || java > 100) {
				System.out.println("시험 점수의 범위는 0부터 100입니다.");
			} else {				
				this.java = java;
				break;
			}
		}
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public String getStuNo() {
		return stuNo;
	}

	public String getName() {
		return name;
	}
	
	
}
