package student;

import java.util.Scanner;

public class StudentGetAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("검색하고자 하는 학생의 학번을 입력하세요.");
		int no = Integer.parseInt(sc.nextLine());
		
		StudentGetService service = new StudentGetService();
		StudentVO vo = service.getInfo(no);
		System.out.println("-------학생 개별 정보 보기--------");
		System.out.println(vo);
	}

}
