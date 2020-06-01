package student;

public class StudentAddService {
	public boolean insert(StudentVO vo) {
		StudentDAO dao = new StudentDAO();
		return dao.insertStudent(vo) > 0 ? true : false;
	}
}
