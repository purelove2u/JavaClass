package ch3;

import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		// 사용자로부터 사칙 연산 기호 및 두 개의 숫자를 입력받아 계산 후 출력
		// +, -, *, / 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("필요한 사칙연산 기호(+, -, *, /, %)를 입력하세요. : ");
		String op = sc.nextLine();
		
		// 두 개의 숫자 입력받기
		System.out.print("첫번째 숫자: ");
		double num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		double num2 = sc.nextInt();
		double result = 0;
		
		switch (op) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			System.out.println("연산자 기호를 확인해 주세요.");
		}
		System.out.printf("결과는 : %.2f %s %.2f = %.3f",num1, op, num2, result);
		
	}

}
