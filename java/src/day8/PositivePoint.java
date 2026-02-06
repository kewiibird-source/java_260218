package day8;

public class PositivePoint extends Point {
	
// 	밑에서 오버로딩 했으니까 처음에 만든 생성자는 삭제해주기
//	PositivePoint(int x, int y) {
//		super(0, 0);
//	}
	
	PositivePoint(int x, int y) {
		super(x,y);
		if (x < 0 || y < 0) { 
			super.move(0, 0);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "(" + getX() + "," + getY() + ")의 점";
	}

	@Override
	protected void move(int x, int y) {
		if (x >= 0 && y >= 0) { // 0보다 크거나 같으면 값을 이동시켜준다! (음수가아닐떄)
			super.move(x, y);
		}
	}

}
