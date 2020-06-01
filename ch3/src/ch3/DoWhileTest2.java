package ch3;

import java.util.Scanner;

public class DoWhileTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메시지 입력"); 
		System.out.println("프로그램 종료를 원하면 q 입력");
		String input = null;
		
		do {
			System.out.print(">> ");
			input = sc.nextLine();
			
			System.out.println(input);
		}while(!input.equals("q"));
		
		System.out.println("프로그램 종료");
		

	}

}
