package ch1;

public class Variable6 {
	public static void main(String[] args) {
		//문자
		char ch1 = 'a';
		char ch2 = 'A';
		char ch3 = '가';
		// ascii code 0~127 : 영어, 특수문자 표현가능
		// A : 65, a : 97
		//unicode : 모든 언어에 대한 문자 표현가능
		// 0~127까지는 ascii코드와 동일
		
		
		char ch4 = 256;
		char ch5 = 44032; //유니코드 테이블에서 10진수 값
		char ch6 = '\uac00'; //유니코드 방식
		char ch7 = '가';
				
		int i = 98;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4); //b
		System.out.println(i);
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(ch7);
		
		
	}
}
