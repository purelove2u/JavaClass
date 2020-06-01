package ch2;

import java.util.Scanner;

public class ConditionTest1 {
	public static void main(String[] args) {
		//사용자가 입력한 숫자가 양수, 음수, 0인지 구분하는 프로그램
		//삼항연산자 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수" : num < 0 ? "음수" : "0";
		System.out.println(result);
		
		
	}
}
