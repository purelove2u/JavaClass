package classtest;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Num1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Input Num2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("Input Operator : ");
		String op = sc.next();
		
		Calc calc = null;
		switch (op) {
		case "+":
			calc = new Add();
			break;
		case "-":
			calc = new Sub();
			break;
		case "*":
			calc = new Mul();
			break;
		case "/":
			calc = new Div();
			break;
		}
		
		calc.setValue(num1, num2);
		System.out.println(calc.calculate());
	}

}
