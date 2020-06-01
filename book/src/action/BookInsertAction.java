package action;

import java.util.Scanner;
import domain.BookVO;
import service.BookInsertService;

public class BookInsertAction implements Action {
	@Override
	public void execute(Scanner sc) {
		// 사용자로부터 도서에 대한 정보 받아들이기
		System.out.print("코드 ");
		String code = sc.nextLine();
		System.out.print("제목 ");
		String title = sc.nextLine();
		System.out.print("작가 ");
		String writer = sc.nextLine();
		System.out.print("가격 ");
		int price = Integer.parseInt(sc.nextLine());
		
		BookVO vo = new BookVO(code, title, writer, price);
		// 입력 받은 정보를 Service 클래스에 넘겨준 후 결과를 리턴받기
		BookInsertService service = new BookInsertService();
		if(service.insert(vo)) {
			System.out.println("입력 성공");
		}else {
			System.out.println("입력 실패");
		}	
	}
}
