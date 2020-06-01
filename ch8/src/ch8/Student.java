package ch8;

public class Student {
	private String id;
	private String name;
	private String addr;
	private String tel;
	private String info;
	
	public Student(String id, String name, 
			String addr, String tel, String info) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.info = info;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" 
	+ addr + ", tel=" + tel + ", info=" + info + "]";
	}
}
