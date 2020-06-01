package ch5;

public class Child1 extends Parent {
	private String name;
	
	public Child1() {
		this("홍길동");
		System.out.println("Child1() call");
	}
	public Child1(String name) {
		this.name = name;
		System.out.println("Child1(String name) call");
	}
}
