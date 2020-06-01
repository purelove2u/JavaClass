package abstract_class;

public class Dog extends Animal {

	public Dog(String kind) {
		super(kind);
	}

	@Override
	public void sound() {
		System.out.println("멍멍 소리를 낸다.");
	}
	public void take() {
		System.out.println("뼈다귀를 먹는다.");
	}
}
