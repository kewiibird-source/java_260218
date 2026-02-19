package day14;

public class GoodCalc2 implements Calculator2 {
	// 인터페이스가 조금 더 설계에 부합하다!

	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int max(int x, int y) {
		// TODO Auto-generated method stub
		return x > y ? x : y;
	}

	
}
