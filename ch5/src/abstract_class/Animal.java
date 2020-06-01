package abstract_class;

public abstract class Animal {
	private String kind; // 동물 종류
	
	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	
	public void eat() {
		System.out.println("먹는다.");
	}
	// 동작 - 숨을 쉰다, 소리를 낸다
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}	
	public abstract void sound();
}
