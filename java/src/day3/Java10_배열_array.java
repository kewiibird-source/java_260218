package day3;

public class Java10_배열_array {

	public static void main(String[] args) {
		//배열(array)도 선언과 동시에 초기화 가능
		//배열도 객체임! 값들중 특정값의 주소를 알기위해서는 위치값도 알아야함
		//arr.length 가지고있는 어레이 크기를 자동으로 알수있음
//		System.out.println(arr[0]);
//		System.out.println(arr[1]); 이렇게 일일이 x
		
		int[] arr = {3,5,2,4,1};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		


	}

}
