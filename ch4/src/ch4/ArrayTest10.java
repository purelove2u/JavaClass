package ch4;

public class ArrayTest10 {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		//String을 숫자로 변경
		int num1 = Integer.parseInt(args[0]);		//무조건 괄호 안에 들어오는 문자를 숫자로 변경
		int num2 = Integer.parseInt(args[1]);
		//int num3 = Integer.parseInt("10a");		//숫자로 변경할 수 없는 수 => 오류
		
		
		System.out.println(num1 + num2);
		//System.out.println(num3);
		
		
	}
}
