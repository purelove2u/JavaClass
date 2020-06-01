package ui;

import java.util.Scanner;

import action.Action;
import action.BookDeleteAction;
import action.BookGetAction;
import action.BookInsertAction;
import action.BookListAction;
import action.BookUpdateAction;

public class BookClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("========== 도서 관리 프로그램 =========");
			System.out.println("  1. 도서정보입력 ");
			System.out.println("  2. 도서정보수정 ");
			System.out.println("  3. 도서정보삭제 ");
			System.out.println("  4. 도서정보조회 ");
			System.out.println("  5. 도서정보 전체조회 ");
			System.out.println("  6. 프로그램종료 ");
			System.out.println("==================================");
			
			System.out.println("\n메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());
			Action action = null;
			switch (menu) {
			case 1:
				action = new BookInsertAction();
				break;
			case 2:
				action = new BookUpdateAction();
				break;
			case 3:
				action = new BookDeleteAction();
				break;
			case 4:
				action = new BookGetAction();
				break;
			case 5:
				action = new BookListAction();
				break;
			case 6:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				System.out.println("번호를 확인해 주세요");;
			}
			if(action != null) {
				action.execute(sc);
			}
		} while (true);
	}
}
