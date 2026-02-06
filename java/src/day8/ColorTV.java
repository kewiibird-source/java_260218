package day8;

public class ColorTV extends TV {
	int color;
	
	ColorTV(int size, int color) {
		super(size); // 부모생성자호출
		this.color = color; // 컬러값 초기화
	}

	void printProperty() {
		System.out.println(getSize() + "인치 " + color + " 컬러"); // TV의 protected int getSize()
	}
	
}
