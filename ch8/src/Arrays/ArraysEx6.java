package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx6 {

	public static void main(String[] args) {

		Integer arr [] = {37, 21, 56, 99, 88, 58, 62, 15, 39, 78};
		
		// 정렬전
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
		//정렬(내림차순)
		// sort(T[] a, comparator<? super T> c)
		// 기본타입은 안되고 객체타입으로 
		Arrays.sort(arr, Comparator.reverseOrder());
		
		//정렬 후
		System.out.println(Arrays.toString(arr));
	}

}
