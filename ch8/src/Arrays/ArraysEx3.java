package Arrays;

import java.util.Arrays;

public class ArraysEx3 {

	public static void main(String[] args) {
		char arr[] = {'a', 'B', 'z', 'C', 'k', 't', 'S', 'b', 'l', 'm'};
		
		// 정렬전
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
		//정렬(오름차순)
		Arrays.sort(arr);
		
		//정렬 후
		System.out.println(Arrays.toString(arr));
	}

}
