package ch4;

public class CalcEx {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		// 리턴없는 메소드 호출
		calc.powerOn();
		// int a = calc.powerOn();   불가능. 오류
		// System.out.println(calc.powerOn());	불가능. 오류
				
		// add 메소드 호출
		int result = calc.add(5, 7); // return 값 받기 int로 보냈으니 int로 받음
		System.out.println(result);
		result = calc.add(12, 6);
		System.out.println(result);
		result = calc.add(18, 19);
		System.out.println(result);
		System.out.println(calc.add(24, 25));
		
		System.out.println(calc.subtrac(5, 3));
		System.out.println(calc.subtrac(12, 24));
		System.out.println(calc.subtrac(15, 6));
		
		System.out.println(calc.multiply(6, 9));
		
		System.out.println(calc.divide(10, 3));
		
	}
}
