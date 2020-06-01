package ch3;

import java.util.Scanner;

public class BreakContinueTest1 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴를 선택하세요(1~3 / 종료는 0)");
			
			String temp = sc.nextLine();
			menu = Integer.parseInt(temp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴 잘못 선택.(종료는 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + " 번");
		}
	}
}
