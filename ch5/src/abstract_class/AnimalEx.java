package abstract_class;

public class AnimalEx {

	public static void main(String[] args) {
		Animal cat = new Cat("포유류");
		cat.breathe();
		cat.sound();
		
		Animal dog = new Dog("포유류");
		dog.breathe();
		dog.sound();	
	}
}
