package day8;

public class ColorPoint extends Point {
	private String color;

	ColorPoint() {
//		super(0,0);
//		this.color = "BLACK";
		this(0, 0, "BLACK"); // 기본생성자 호출했을때 => (0,0) 위치의 BLACK 색 점
	}
	
	ColorPoint(int x, int y){
		this(x, y, "BLACK");
	}

	ColorPoint(int x, int y, String color) { // 생성자를통하여 3개의값을 받을거임
		super(x, y);
		this.color = color; // 내거에 컬러저장
	}

	void setXY(int x, int y) {
		super.move(x, y); // x와y값을 초기화
	}

	void setColor(String color) { // 컬러값을 받아서 넣어준다
		this.color = color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.color + "색의 (" + getX() + "," + getY() + ")의 점";
	}

}
