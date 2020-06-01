package action;

import java.util.Scanner;

import domain.BookVO;
import service.BookGetService;

public class BookGetAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// 사용자로부터 code를 입력받고 해당하는 도서 정보를 화면에 출력하기
		System.out.println("도서 코드 입력");
		String code = sc.nextLine();
		
		// 해당하는 도서 정보를 화면에 출력하기
		BookGetService service = new BookGetService();
		BookVO vo = service.getBook(code);
		System.out.println(vo);
	}

}
