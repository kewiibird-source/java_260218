package day8;

public class TVMain {

	public static void main(String[] args) {
		
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty(); // 32인치 2048컬러

		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //나의 iptv "192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
	}

}
