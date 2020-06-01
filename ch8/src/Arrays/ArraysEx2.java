package Arrays;

import java.util.Arrays;

public class ArraysEx2 {
	public static void main(String[] args) {
		int arr[] = {37, 21, 56, 99, 88, 58, 62, 15, 39, 78};
		
		// 정렬전
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
		//정렬(오름차순)
		Arrays.sort(arr);
		
		//정렬 후
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
