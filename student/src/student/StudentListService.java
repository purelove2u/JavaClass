package student;

import java.util.List;

public class StudentListService {
	public List<StudentVO> getList(){
		StudentDAO dao = new StudentDAO();
		return dao.getList();
	}
}
