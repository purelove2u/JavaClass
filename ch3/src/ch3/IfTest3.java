package ch3;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		// 짝수, 홀수 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

}
