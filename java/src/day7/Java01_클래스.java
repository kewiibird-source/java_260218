package day7;

public class Java01_클래스 {

	public static void main(String[] args) {
//		Calculator.sum(1,2); //객체 생성 후 사용 가능
		Calculator c = new Calculator("아주좋은계산기", 100000, "초록색");//객체생성
		int num = c.sum(3, 5);
		System.out.println(num);
		
		int arr[] = {1,3,2,4,5};
		int sum = c.sum(arr);
		System.out.println(sum);
		
		System.out.println(c.getName());
	}

}
