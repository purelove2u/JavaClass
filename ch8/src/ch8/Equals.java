package ch8;

public class Equals {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "Hello";
		
		System.out.println(str1.equals(str2));				// 대소문자 구문 O
		System.out.println(str1.equalsIgnoreCase(str2));	// 대소문자 구분 X
	}
}
