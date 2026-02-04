package day6.classEx;

public class Car_Test {
	private String name; // 자동차이름
	private String color; // 자동차색상
	private int speed; // 자동차속도

	Car_Test(){
//		this("기본차","하얀색",0);
		this.name = "기본차";
		this.color = "하얀차";
	}
	void setInfo(String name, String color, int speed) {
		
	}
	
	public void carInfo(){
		System.out.println("자동차의 이름은 "+this.name+"색상은 ");
	}
	
	void speedUp(int speed) {
		this.speed += speed;
		if(this.speed > 200) {
			System.out.println("200 초과의 속도는 불가합니다. 200으로 변경합니다.");
			this.speed = 200;
		}
	}

	void speedDown(int speed) {
		this.speed-= speed;
		if(this.speed<0) {
			System.out.println("0 미만의 솟도는 불가. 0으로 고정");
			
		}
	}
	
	public int getSpeed() {
		return speed;
	}

}
