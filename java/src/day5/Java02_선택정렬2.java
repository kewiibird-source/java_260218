package day5;

public class Java02_선택정렬2 {

	public static void main(String[] args) {
		// 1.01선택정렬 에서 작성한 코드의 규칙성을 찾아서
		// 반복문으로 다시 작성해보기
		int arr[] = { 2, 3, 5, 1, 4 }; // 배열크기의 -1번만큼 비교햐ㅑㅐ
		
		int minIndex = 0; //가장작은값찾기위한변수선언 , 맨앞부터 탐색해야함, 첫시작 0번쨰
		for(int i=1; i<arr.length; i++) {  // i번쨰 (1) 민인덱스다음부터 비교하겠다
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;
	}

}
