package day5.classEx;

public class StuMain {

	public static void main(String[] args) {
		Student hong = new Student("홍길동", 30, "1234");
//		hong.study();
//		hong.study("자바");
//		hong.money = 100000;
//		hong.money = hong.money - 30000;
		hong.money_708 = hong.money_708 - 50000;
		System.out.println(hong.money_708);
		
		Student kim = new Student("김철수", 25, "5678");
//		kim.money = 50000;
//		System.out.println(kim.money_708);
		Student.money_708 = Student.money_708-30000;
		System.out.println(Student.money_708);
//		kim.study();
//		kim.study("과학");
//		String stuNo = kim.getStuNo();
		
	}

}
