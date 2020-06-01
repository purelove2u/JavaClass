package ch2;

public class ConditionTest2 {

	public static void main(String[] args) {
		char ch1 = 'z';
		//ch1 이 영문자(대문자 또는 소문자)이거나
		//숫자일 때 변수 b의 값이 true가 나오는 프로그램
		
		//boolean b = ('A' <= ch1 <= 'z') || (48 <= ch1 <= 57) ? true : false
		
		//boolean b = (ch1 >= 'A' && ch1 <= 'z') || (ch1 >= '1' && ch1 <= '9') ? true : false;
		
		String b = (ch1 >= 'A' && ch1 <= 'z') || (ch1 >= '1' && ch1 <= '9') ? "참" : "거짓";
		
		boolean c = (ch1 >= 65 && ch1 <= 122) || (ch1 >= 48 && ch1 <= 57) ? true : false;
 		
		System.out.println(b);
		System.out.println(c);
		
	}

}
