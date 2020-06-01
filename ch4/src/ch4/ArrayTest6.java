package ch4;

public class ArrayTest6 {
	public static void main(String[] args) {
		int arr1[] = {100, 95, 85, 65, 75, 55};
		
		// 배열 요소의 합계와 평균을 출력
		int sum = 0;
		for(int i : arr1) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / arr1.length);
		
		//배열 요소에서 가장 큰 값 출력
		int max = arr1[0];
		for(int i : arr1) {
			if(max < i) {
				max = i;
			}
		}
		System.out.println("가장 큰 값은 : " + max);
		
		//배열 요소에서 가장 작은 값 출력
		int min = arr1[0];
		for(int i : arr1) {
			if(min > i) {
				min = i;
			}
		}
		System.out.println("가장 작은 값은 : " + min);
		
	}
}
