package Arrays;

import java.util.Arrays;

public class ArraysSearch5 {

	public static void main(String[] args) {
		String x[] = {"abstract", "assert", "boolean", "break", "byte", "case",
				 "continue", "default", "do", "else", "enum", "fianl", "fianlly",
				  "import", "instanceof", "native", "new", "package", "private", 
				  "return", "short", "static", "strictfp", "switch","synchronized", 
				  "this", "try", "void", "while"};
		
		// "private" 문자열 찾기
		System.out.println(Arrays.binarySearch(x, "private"));
		
	}

}
