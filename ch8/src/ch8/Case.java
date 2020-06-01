package ch8;

public class Case {
	public static void main(String[] args) {
		// 소문자 -> 대문자, 대문자 -> 소문자, 공백제거
		
		String str1 = "abcdefg";
		String str2 = "ABCDEFG";
		String str3 = "      abc 대한민국   ";
		
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		//시작과 끝부분부터 문자열 시작점까지의 공백 제거
		System.out.println(str3.trim());	
		System.out.println(str3.equals("abc 대한민국")); // 공백도 문자
		
	}
}
