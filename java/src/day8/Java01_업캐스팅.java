package day8;

public class Java01_업캐스팅 {
	
//	static void test1(ColorPoint cp) {
//		System.out.println(cp.getX() * cp.getY());
//	}
	
	// 메소드 인자를 부모클래스로 넣으면 자식클래스들도 다 들어올 수 있음!
	static void test1(Point p) { // instanceof 업캐스팅 된 객체가 어떤 클래스로 만들어진 객체인지 ?
		if(p instanceof Point3D) {
			System.out.println("Point3D로 만든 객체!");
		}
		System.out.println(p.getX() * p.getY());
	} 

	public static void main(String[] args) {
		Point point = new Point(1,2);
		ColorPoint colorPoint = new ColorPoint(10, 20, "blue");
		Point3D point3D = new Point3D(1,2,3);
		PositivePoint positivePoint = new PositivePoint(5, 10);
		
		test1(point3D); // ColorPoint
	}

}
