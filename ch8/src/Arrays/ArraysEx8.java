package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx8 {

	public static void main(String[] args) {

		String arr [] = {"apple", "good", "height", "piano", "any", "arm", "ape"};
		
		// 정렬전
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
		//정렬(내림차순)
		Arrays.sort(arr, Comparator.reverseOrder());
		
		//정렬 후
		System.out.println(Arrays.toString(arr));
	}

}
