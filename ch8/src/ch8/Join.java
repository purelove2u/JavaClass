package ch8;

public class Join {
	public static void main(String[] args) {
		String animals = "dog, cat, bear";
		
		//지정된 문자열로 자르기
		String arr[] = animals.split(",");
		
		//지정된 문자열로 연결하기
		String str = String.join("-", arr);
		System.out.println(str);
		
	}
}
