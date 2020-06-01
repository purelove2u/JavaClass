package service;

import java.util.List;

import domain.BookVO;
import persistence.BookDAO;

public class BookListService {
	public List<BookVO> getList(){
		BookDAO dao = new BookDAO();
		return dao.getlist();
	}
}