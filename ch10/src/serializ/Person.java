package serializ;

import java.io.Serializable;

// 직렬화 : serializable
// 객체가 가진 데이터들을 순차적인 데이터로 변환하는 것

public class Person implements Serializable{
	// 역 직렬화시 같은 클래스인지 구별하기 위해 사용
	private static final long serialVersionUID = -2675007521112485288L;
	
	private String name;
	private String job;
	transient String addr;	// 직렬화 시키지 말것
	
	public Person(String name, String job, String addr) {
		super();
		this.name = name;
		this.job = job;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", addr=" + addr + "]";
	}
}
