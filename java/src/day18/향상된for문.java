package day18;

public class 향상된for문 {

	public static void main(String[] args) {		
		int arr[] = { 1, 3, 5, 2, 4, 8, 9, 7 };
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); // 배열에 순차적으로 접근하는 방식.
		}
		
		// 향상된 for문
		for(int num : arr) {
			System.out.println(num); // num에 값이 들어가 순차적으로 배열에 접근
		}
		// 가장큰 값을 찾는것 OK , 가장큰값의 인덱스를 찾아라! X 
		// num에는 값만 들어가고 인덱스는 포함되지 않음.
		
		String arr2[] = {"java", "oracle", "html"};
		for(String subject : arr2) {
			System.out.println(subject);
		}
		
		
	}

}
