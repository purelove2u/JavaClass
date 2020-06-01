package ch8;

public class IndexOf2 {

	public static void main(String[] args) {

		String str1 = "Hello";
		
		System.out.println(str1.indexOf('o'));
		System.out.println(str1.indexOf('f'));
		System.out.println(str1.indexOf('h', 2));	// 2번 인덱스부터
		System.out.println(str1.indexOf("el", 1));	// 1번 인덱스부터
		
	}

}
