package action;

import java.util.Scanner;

import service.BookDeleteService;

public class BookDeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 사용자로부터 code를 입력받고 해당하는 도서 정보를 화면에 출력하기
		System.out.print("도서 코드 입력");
		String code = sc.nextLine();
		
		// BookDeleteService 객체의 delete호출
		// 실행 후 결과를 받아 삭제 성공 혹은 삭제 실패 메시지 출력
		BookDeleteService service = new BookDeleteService();
		System.out.println(service.delete(code) > 0 ? "삭제성공" : "삭제 실패");
	}
}
