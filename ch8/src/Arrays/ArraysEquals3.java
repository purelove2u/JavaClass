package Arrays;

import java.util.Arrays;

public class ArraysEquals3 {

	public static void main(String[] args) {
		String str2d[][] = {
				{"aaa", "bbb"}, {"AAA", "BBB"}
		};
		String str[][] = {
				{"aaa", "bbb"}, {"AAA", "BBB"}
		};
		
		// 1차원 배열은 equals
		System.out.println(Arrays.equals(str2d, str));
		// 2차원 배열은 deepEquals
		System.out.println(Arrays.deepEquals(str2d, str));
		
		}
}