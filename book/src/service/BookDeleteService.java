package service;

import persistence.BookDAO;

public class BookDeleteService {
	public int delete(String code) {
		BookDAO dao = new BookDAO();
		return dao.deleteBook(code);
	}
}
