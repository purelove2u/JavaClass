package service;

import domain.BookVO;
import persistence.BookDAO;

public class BookGetService {
	public BookVO getBook(String code) {
		BookDAO dao = new BookDAO();
		return dao.getRow(code);
	}
}
