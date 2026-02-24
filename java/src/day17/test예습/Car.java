package day17.test예습;

public class Car {
	String kind;
	int speed;
	String color;
	
	
	
	public Car(String kind, int speed, String color){
		this.kind = kind;
		this.color = color;
		this.speed = speed;
	}
	
//	@Override
//	public void toString() {
//		
//		System.out.println("차 종류는 " + this.kind + " 색은 " + this.color + "입니다.");
//
//	}
	
	
	
	
	public static void main(String[] args) {
		Car c = new Car("소나타", 0, "검정");
		
	}
}
