package abstract_class;

public class Cat extends Animal {

	public Cat(String kind) {
		super(kind);
	}

	@Override
	public void sound() {
		System.out.println("야옹 소리를 낸다.");
	}
}
