package action;

import java.util.Scanner;

import domain.BookVO;
import service.BookUpdateService;

public class BookUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정하고자 하는 책의 코드를 입력하세요.");
		String code = sc.nextLine();
		System.out.println("수정된 가격을 입력하세요.");
		int price = Integer.parseInt(sc.nextLine());
		
		BookVO vo = new BookVO();
		vo.setCode(code);
		vo.setPrice(price);
		
		BookUpdateService service = new BookUpdateService();
		System.out.println(service.update(vo) > 0 ? "수정 성공" : "수정 실패");
	}

}
