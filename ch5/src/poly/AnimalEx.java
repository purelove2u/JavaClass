package poly;

public class AnimalEx {

	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println();
		// 자동 형변환이 일어남 (좌 부모 우 자식)
		Animal animal = new Cat();
		System.out.println();
		Feline feline = new Cat();
		
//		Dog dog = new Dog();
//		Cat cat1 = new Dog();
		
		// 강제 형변환 안됨 (좌 자식 우 부모)
		Feline feline2 = (Feline) new Animal();
		
	}

}
