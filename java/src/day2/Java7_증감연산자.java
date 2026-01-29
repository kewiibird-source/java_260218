package day2;

public class Java7_증감연산자 {

	public static void main(String[] args) {
		int a = 8;
		int b = 3;
		int c = ++a;
		int d = c--;
		int e = --a;
		b++;
		int f = b++;

		System.out.println(a); // => 8 
		System.out.println(b); // => 4 / 5
		System.out.println(c); // => 9 / 8
		System.out.println(d); // => 9 
		System.out.println(e); // => 7 / 8
		System.out.println(f); // => 4

	}

}
