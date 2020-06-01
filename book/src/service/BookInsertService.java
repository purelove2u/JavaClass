package service;


import domain.BookVO;
import persistence.BookDAO;

public class BookInsertService {
	public boolean insert(BookVO vo) {
		// 넘겨받은 정보를 데이터베이스에 입력한 후 결과 전송하기
		BookDAO dao = new BookDAO();
		return dao.insertBook(vo) > 0 ? true : false;
	}
}
