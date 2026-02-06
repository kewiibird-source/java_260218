package day8;

public class TV {
	private int size;

	public TV(int size) { // 사이즈 초기화 생성자
		this.size = size;
	}

	protected int getSize() { // 사이즈값 얻기
		return size;
	}

}
