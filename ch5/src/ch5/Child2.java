package ch5;

public class Child2 extends Parent {
private String name;
	
	public Child2() {
		this("홍길동");
		System.out.println("Child2() call");
	}
	public Child2(String name) {
		this.name = name;
		System.out.println("Child2(String name) call");
	}
	
}
