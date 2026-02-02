package classEx;

public class CalcMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.intro();

		int a = calc.abs(-12);
		int b = calc.sum(123, 123);
		int c = calc.abs(-122);

		calc.sum(5, 10.8);
		calc.sum(14, 2, 3);
		
		System.out.println();

	}

}
