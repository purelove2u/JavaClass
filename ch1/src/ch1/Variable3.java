package ch1;

public class Variable3 {

	public static void main(String[] args) {
		//변수선언
		int val1, val2, val3;
		long val4, val5;
		
		//초기화
		val1 = 15;
		val2 = 20;
		val3 = 30;
		
		//val1 = 1000000000000;
		val4 = 1000000000000L;
		val5 = 1234567890l;
		
		//사용
		// + = 덧셈, 연결
		int result = val1 + val3;
		System.out.println("val1 + val2 = " + (val1 + val2));
		System.out.println(val2 + val3);
		System.out.println("result 값 : " + result);
		System.out.println(val1 + " " + val4 + " " + val5);
		
		
	}

}
