package ch8;

public class ValueOf1 {
	public static void main(String[] args) {
		String str1 = 10 + "";
		String str2 = String.valueOf(10);
		String str3 = String.valueOf(10.5);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
