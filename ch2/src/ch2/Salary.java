package ch2;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한 달 월급 입력 : ");
		int salary = sc.nextInt();
		//System.out.println("월급 : " + salary);
		//한 달 월급을 10년 동안 모두 저축했을 때 저축 금액을 구하시오
		
		System.out.println("총 금액 : " + salary * 120 + "원");	// or 12 * 10
		
		int sum = salary * 120;	// or 12 * 10
		System.out.println("총 금액 : " + sum + "원");
		
				
	}
}
