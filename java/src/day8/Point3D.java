package day8;

public class Point3D extends Point {
	private int z;
	Point3D(int x, int y, int z){
		super(x, y); // 부모거 가져옴
		this.z = z; 
	}
	
	void moveUp() {
		this.z += 1;
	}
	void moveDown() {		
		this.z -= 1;
	}
	void move(int x, int y, int z) {
		super.move(x, y); // 부모 move 가져와서
		this.z = z;
	}
	
	
	
	@Override
	public String toString() {
		return ("(" + getX() + "," + getY() + "," + this.z + ")의 점");
	}
	
}
