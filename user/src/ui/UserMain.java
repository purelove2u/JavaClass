package ui;

import java.util.Scanner;

import action.Action;
import action.UserAddAction;
import action.UserDeleteAction;
import action.UserGetAction;
import action.UserListAction;
import action.UserUpdateAction;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("=========== 사용자 관리 프로그램 ===========");
			System.out.print("1. user 등록 | ");
			System.out.print("2. user 전체보기 | ");
			System.out.print("3. user 조회 | ");
			System.out.print("4. user 수정 | ");
			System.out.print("5. user 삭제 | ");
			System.out.print("6. 프로그램 종료");
			System.out.println();
			
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			Action action = null;
			
			switch (menu) {
			case 1:
				action = new UserAddAction();
				break;
			case 2:
				action = new UserListAction();
				break;
			case 3:
				action = new UserGetAction();
				break;
			case 4:
				action = new UserUpdateAction();
				break;
			case 5:
				action = new UserDeleteAction();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				break;
			}
			if(action != null) {
				action.execute(sc);
			}
		} while (true);
	}
}
