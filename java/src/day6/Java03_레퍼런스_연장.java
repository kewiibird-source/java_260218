package day6;

public class Java03_레퍼런스_연장 {

	static void test1(String text) {
		
	}
	
	static void test2(Employee e) {
		
	}
	
	public static void main(String[] args) {
		String a = "Hello";
		String s = new String("Hello");
		test1(a);
		
		Employee hong = new Employee("홍길동", 30, "인천", "남자", "1234");
//			test2("hong");
	}

}
