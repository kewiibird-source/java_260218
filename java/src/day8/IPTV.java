package day8;

public class IPTV extends ColorTV {
	String ip;
	
	IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	@Override
	void printProperty() {
		System.out.print("나의 IPTV는 "+ip+" 주소의 ");
		super.printProperty(); //부모거 호출 (getSize() + "인치 " + color + " 컬러");
	} 

}
