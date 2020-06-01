package ch8;

public class TocharArray {
	public static void main(String[] args) {
		
		String str1 = "Hello! Java";
		
		char[] arr = str1.toCharArray();
		
		for(char ch : arr) {
			System.out.print(ch);
		}
	}
}
