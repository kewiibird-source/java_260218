package day3;

public class Java13_배열_array4 {

	public static void main(String[] args) {
		//어떤 숫자가 제일 클까요를알아보기
		//i가 0일때 0번째숫자(5) > max(0)
		int[] arr = {5, 3, 8, 4, 2};
		int max = arr[0]; // 큰 숫자 백업용
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		} System.out.println(max);
	}
}
