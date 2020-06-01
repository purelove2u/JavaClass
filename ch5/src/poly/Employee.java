package poly;

public class Employee {
	// 이름 => 홍길동, 직위 => 사원, 사장, 아르바이트
	private String name;
	private String position;
	
	// 일한다.
	public void work() {
		System.out.println(name + " " + position + "이(가) 일한다.");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
