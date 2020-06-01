package ch3;

import java.util.Scanner;

public class DoWhileTest1 {
	public static void main(String[] args) {
		// do ~ while(조건);
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1~100사이의 정수 입력");
			input = sc.nextInt();
			
			if(answer < input) {
				System.out.println("더 작은 수 입력");
			}else {
				System.out.println("더 큰 수 입력");
			}
		}while(input != answer);
		System.out.println("정답!!!");
	}
}
