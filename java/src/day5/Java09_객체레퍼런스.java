package day5;

public class Java09_객체레퍼런스 {
	static void foodMarket(Human human, String food, int price) {
		System.out.println(human.name + "(이)가 " + food + "(을)를 " + price + "원에 구매했습니다.");
		human.money = human.money - price;
	}

	public static void main(String[] args) {
		Human hong = new Human("홍길동", 50000);
		Human kim = new Human("김철수", 80000);

		foodMarket(hong, "라면", 1000);
		System.out.println("길동이 남은돈 " + hong.money);
		
		
	}

}
