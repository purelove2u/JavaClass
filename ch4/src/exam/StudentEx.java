package exam;

public class StudentEx {

	public static void main(String[] args) {
		// Student 객체 3개 생성
//		Student student1 = new Student();
//		Student student2 = new Student();
//		Student student3 = new Student();
		Student student[] = new Student[3];
		System.out.println(student[0]);
		
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student();
		System.out.println(student[0]);
		
		//첫번째 student 객체 초기화
		student[0].addr = "서울";
		student[0].name = "홍길동";
		student[0].no = 1;
		
		//두번째 student 객체 초기화
		student[1].addr = "부산";
		student[1].name = "심청";
		student[1].no = 2;
		
		//세번째 student 객체 초기화
		student[2].addr = "광주";
		student[2].name = "아무개";
		student[2].no = 3;

		print(student);	// 배열 전체를 던진다
		print2(student[0]);	// 배열 요소 중 하나(값만)를 던진다
		print2(student[1]);
		print2(student[2]);
		
		for(int i = 0 ; i < student.length ; i++) {
			System.out.println(student[i].no);
			System.out.println(student[i].name);
			System.out.println(student[i].addr);
		}
	}
	
	static void print(Student[] student) {	// 배열 전체를 받기 때문에 Student[]
		for(Student s : student) {
			System.out.println(s.no + " " + s.name + " " + s.addr);
		}
	}
	static void print2(Student student) {	// 배열 요소를 받기 때문에 Student
		System.out.println(student.no + " " + student.name + " "  + student.addr);
	}
}
