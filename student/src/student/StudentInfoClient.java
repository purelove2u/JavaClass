package student;

import java.util.Scanner;

public class StudentInfoClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("--------<학생 정보 관리 프로그램>-------");
			System.out.println("   1. 학생정보 입력 ");
			System.out.println("   2. 학생정보 전체 조회 ");
			System.out.println("   3. 학생정보 개별 조회 ");
			System.out.println("   4. 프로그램 종료 ");
			System.out.println("-----------------------------------");
			System.out.print("선택 : ");
			
			int menu = Integer.parseInt(sc.nextLine());
			Action action = null;
			
			switch (menu) {
			case 1:
				action = new StudentAddAction();
				break;
			case 2:
				action = new StudentListAction();
				break;
			case 3:
				action = new StudentGetAction();
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				System.out.println("번호를 확인해주세요.");
				break;
			}
			if(action != null) {
				action.execute(sc);
			}
		} while (true);
	}
}
