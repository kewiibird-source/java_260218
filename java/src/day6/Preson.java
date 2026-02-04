package day6;

public class Preson {
	private String name;
	private int age;
	private String addr;
	private String gender;
	
	Preson(){
		System.out.println("Person 생성자 호출!");
	}
	
	Preson(String name, int age, String addr){
			this(name, age, addr, "");
	}
	
	Preson(String name, int age, String addr, String gender){
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
	}
	
}
