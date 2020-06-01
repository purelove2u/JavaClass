package student;

import java.util.Scanner;

public class StudentAddAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.print("학  번 : ");
		int no = Integer.parseInt(sc.nextLine());
		System.out.print("이  름 : ");
		String name = sc.nextLine();
		System.out.print("학  년 : ");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.print("생 일(예시 : 05/11) : ");
		String birth = sc.nextLine();
		
		StudentVO vo = new StudentVO(no, name, grade, birth);
		
		StudentAddService service = new StudentAddService();
		if(service.insert(vo)) {
			System.out.println("입력 성공");
		}else {
			System.out.println("입력 실패");
		}
		
	}

}
