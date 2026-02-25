package day18;

import java.util.ArrayList;
import java.util.Random;

public class 리스트 {

	public static void main(String[] args) {
		// <> 안에는 넣고싶은 데이터 타입 넣어라
		ArrayList<String> menuList = new ArrayList<>();
		// add로 리스트에 값 넣기
		menuList.add("볶음밥");
		menuList.add("햄버거");
		menuList.add("순두부찌개");
		menuList.add("보쌈");
		menuList.add("닭발");
//		System.out.println(menuList);
		// [볶음밥, 햄버거, 순두부찌개, 보쌈, 닭발]
		
		// 랜덤으로 한개 추천해주기
		Random r = new Random();
		// size로 리스트 크기 알기
		int ranNum = r.nextInt(menuList.size());
		// get으로 리스트 안의 값을 가져오기
		System.out.println(menuList.get(ranNum));
		
		// 리스트에 있는 모든값 비우기
//		menuList.clear();
//		System.out.println(menuList);
	}

}
