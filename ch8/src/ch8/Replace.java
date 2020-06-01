package ch8;

public class Replace {
	public static void main(String[] args) {
	
		//String : immutable(변경할 수 없는)	
		
		String str = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		str = str.replace("자바", "Java");
		System.out.println(str);
		
		str = str.replaceFirst("Java", "자바");
		System.out.println(str);
		
	}
}
