package Arrays;

import java.util.Arrays;

public class ArraysEx4 {

	public static void main(String[] args) {

		String arr [] = {"apple", "good", "height", "piano", "any", "arm", "ape"};
		
		// 정렬전
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
		//정렬(오름차순)
		Arrays.sort(arr);
		
		//정렬 후
		System.out.println(Arrays.toString(arr));
	}

}
