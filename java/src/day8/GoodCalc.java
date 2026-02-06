package day8;

public class GoodCalc implements Calculator {
// 한개라도 오버라이드 안하면 오류남!
	
	@Override
	public int sum(int x, int y) {
		return x + y;
	}

	@Override
	public int abs(int x) {
		return x < 0 ? -x : x;
	}

	@Override
	public int max(int x, int y) {
		return x > y ? x : y;
	}
	
}
