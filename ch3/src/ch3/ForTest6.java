package ch3;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		// 숫자를 입력받아 해당 숫자의 factorial 값 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int result = 1;
		for(int i = num ; i >= 1 ; i--) {
			result*=i;
		}
		System.out.println(num + " Factorial값 : " + result);

	}

}
