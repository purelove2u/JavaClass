package ch4;

public class Student {
	int grade;		//학년 : 1,2,3,4....
	String name;	//이름 : 홍길동
	String addr;	//주소 : 서울, 대구...
	String mobile;	//핸드폰 번호: 010123465678

	
	// 생성자 오버로딩(constructor overloading)
	// 	- 하나의 클래스에 동일한 생성자가 여러개 들어오는 것
	//	- 괄호 안이 달라야 함
	Student(){}
	
	Student(int grade, String name, String addr){
		this.grade = grade;
		this.name = name;
		this.addr = addr;
	}

	Student(int grade, String name, String addr, String mobile){
//		this.grade = grade;
//		this.name = name;
//		this.addr = addr;
		this(grade, name, addr);	// 한줄로 정리가능 위 생성자 호출
		this.mobile = mobile;
	}
}
