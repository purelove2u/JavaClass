package ch3;

import java.util.Scanner;

public class IfTest9 {
	public static void main(String[] args) {
		// 세 개의 숫자를 입력받은 후 가장 작은 수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();

		System.out.print("세번째 숫자 : ");
		int num3 = sc.nextInt();
		
		int result = num1;
		if(result > num2) {
			result = num2;
		}
		if(result > num3) {
			result = num3;
		}

		System.out.printf("가장 작은 수는 : %d\n", result);
				
		// 가장 큰 수 구하기

		int max = num1;
		if(max < num1) {
			max = num1;
		}
		if(max < num2) {
			max = num2;
		}
		
		System.out.printf("가장 큰 수는 : %d", max);
	}
}
