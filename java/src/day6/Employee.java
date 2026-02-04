package day6;

public class Employee extends Preson {
	String empNo;
	
	public Employee(String name, int age, String addr, String empNo) {		
		super(name, age, addr); //부모생성자호출 , 생성자 선택하고 싶다면 인자값을 동일하게!
		this.empNo = empNo;
	}
	public Employee(String name, int age, String addr, String gender, String empNo) {
		super(name, age, addr, gender); //부모생성자호출 , 생성자 선택하고 싶다면 인자값을 동일하게!
		this.empNo = empNo;
	}
}
