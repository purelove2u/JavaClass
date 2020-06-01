package Arrays;

import java.util.Arrays;

public class ArraysSearch {
	public static void main(String[] args) {
		int arr[] = {10, 99, 18, 55, 45, 35, 65};
		
		Arrays.sort(arr);
		
		System.out.println("Arrays.binarySearch의 return 값은 : "+ Arrays.binarySearch(arr, 45));
		
		// 배열에 45라는 값이 들어있는지 확인하고
		// 찾으면 그 찾은 위치를 출력하고
		// 찾지 못하면 검색 값 없음 이라는 메세지 출력
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == 45) {
				System.out.println("45의 위치는 : arr[" + i + "]" );
			}
			if(i == arr.length) {
				System.out.println("검색 값 없음.");
			}
		}	
	}
}
