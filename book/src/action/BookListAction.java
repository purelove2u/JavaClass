package action;

import java.util.List;
import java.util.Scanner;

import domain.BookVO;
import service.BookListService;

public class BookListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		BookListService service = new BookListService();
		List<BookVO> list = service.getList();
		System.out.println("===============책 전체 보기================");
		System.out.println("코드 \t제목\t\t저자\t가격");
		
		for(BookVO vo : list) {
			System.out.print(vo.getCode() + "\t");
			System.out.print(vo.getTitle() + "\t");
			System.out.print(vo.getWriter() + "\t");
			System.out.print(vo.getPrice() + "\n");
		}	
	}
}
