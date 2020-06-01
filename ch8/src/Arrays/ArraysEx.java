package Arrays;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		// Arrays 클래스 : 배열과 관련된 유용한 기능을 제공하는 클래스
		char ch[] = {'H', 'a', 'p', 'p', 'y'};
		
		// 배열 복사하기
		char ch1[] = new char[ch.length];
		System.arraycopy(ch, 0, ch1, 0, ch.length);
		System.out.println(ch1);
		
		char ch2[] = ch.clone();
		System.out.println(ch2);
		
		char ch3[] = Arrays.copyOf(ch, ch.length);
		System.out.println(ch3);
		
		char ch4[] = Arrays.copyOfRange(ch, 1, 3);	// 1<= 범위 <3
		System.out.println(ch4);
	}
}
