package ch8;

public class LastIndexOf {

	public static void main(String[] args) {
		String str1 = "HelloHelloHello World";
		
		System.out.println(str1.indexOf('l'));		// 맨 처음 것.
		System.out.println(str1.lastIndexOf('l'));	// 맨 마지막 것.
	}
}
