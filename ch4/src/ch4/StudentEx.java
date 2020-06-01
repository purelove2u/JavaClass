package ch4;

public class StudentEx {

	public static void main(String[] args) {
		Student student1 = new Student(2, "홍길동", "서울", "01012345678");
		Student student2 = new Student();
		Student student3 = new Student(3, "성춘향", "강원");
		
		
		System.out.println(student1.name+ " "  + student1.grade + " " + student1.addr 
				+ " " + student1.mobile);
		System.out.println(student3.name+ " "  + student3.grade + " " + student3.addr);
	}

}
