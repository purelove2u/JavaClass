package ch8;

public class StringConstructor1 {
	public static void main(String[] args) {
		// 객체 생성
		String str1 = new String();
		
		byte bytes[] = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str2 = new String(bytes);
		System.out.println(str2);
		
		char ch[] = {'a','b','c','d','e'};
		String str3 = new String(ch);

		String str4 = new String("hello");
		
		String str5 = new String(new StringBuffer("World"));
		String str6 = new String(new StringBuilder("World"));

		String str7 = "Hello World";
			
	}
}
