package student;

import java.util.List;
import java.util.Scanner;

public class StudentListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		StudentListService service = new StudentListService();
		List<StudentVO> list = service.getList();
		System.out.println("------학생 정보 보기------");
		System.out.println("학 번 \t 이 름 \t 학 년 \t생 일");
		System.out.println("-----------------------");
		
		for(StudentVO vo : list) {
			System.out.print(vo.getNo() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getGrade() + "\t");
			System.out.print(vo.getBirth() + "\t\n");
		}
	}

}
