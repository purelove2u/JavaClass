package student;

public class StudentGetService {
	public StudentVO getInfo(int no) {
		StudentDAO dao = new StudentDAO();
		return dao.getStudentInfo(no);
	}
}
