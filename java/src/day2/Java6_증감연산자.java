package day2;

public class Java6_증감연산자 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
//		a++; // a = a+1; 
		int c = a++;
		// 증감연산자가 뒤에 있으면 먼저 값을 넣고 증감이 된다. 
		
		System.out.println(c);

		// 증감연산자가 앞에 있으면 먼저 증감을 하고 값을 넣게 된다.
		int d = ++b; // d = 1 + 5
		System.out.println(d); // => 6
		
		int e = b--;
		System.out.println(e); // => 6

	}

}
