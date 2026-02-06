package day8;

public class PointMain {

	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(5, 5, "YELLOW"); 
//		cp.setXY(10,20);	
//		cp.setColor("RED");
//		String str = cp.toString(); // 오브젝트의 메소드니까 오버라이딩 해야됨!!
//		System.out.println(str + "입니다. ");

//		ColorPoint zeroPoint = new ColorPoint(); // 기본생성자 호출했을때 => (0,0) 위치의 BLACK 색 점
//		System.out.println(zeroPoint.toString() + "입니다.");
//		ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
//		cp.setXY(5, 5);
//		cp.setColor("RED");
//		System.out.println(cp.toString() + "입니다."); // => toString 생략가능

//		Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
//		   System.out.println(p.toString()+"입니다.");
//		   p.moveUp(); // z 축으로 위쪽 이동
//		   System.out.println(p.toString()+"입니다.");
//		   p.moveDown(); // z 축으로 아래쪽 이동
//		   p.move(10, 10); // x, y 축으로 이동
//		   System.out.println(p.toString()+"입니다.");
//		   p.move(100,  200, 300); // x, y, z축으로 이동
//		   System.out.println(p.toString()+"입니다.");

		PositivePoint p = new PositivePoint(1,2);
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");

	}

}
