package ch3;

import java.util.Scanner;

public class Bankapplication {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 : ");
			//사용자가 입력하는 값 받기
			int no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.print("예금액 >> ");
				int input = sc.nextInt();	// balance += sc.nextInt();
				balance += input;			//	로 줄일 수 있음.
				continue;
			case 2:
				System.out.print("출금액 >> ");
				int output = sc.nextInt();
				if(balance > output) {
					balance -= output;
				}else {
					System.out.println("잔고가 부족합니다.");
				}
				continue;
			case 3:
				System.out.printf("현재잔액 : %d\n", balance);
				continue;
			case 4:
				run = false;
				break;
			default:
				System.out.println("번호를 확인해 주세요");
				break;
			}
		}
	}
}