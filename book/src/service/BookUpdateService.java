package service;

import domain.BookVO;
import persistence.BookDAO;

public class BookUpdateService {
	public int update(BookVO vo) {
		BookDAO dao = new BookDAO();
		return dao.updateBook(vo);
	}
}
