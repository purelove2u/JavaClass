package ch7;

public class ClassCastExceptionEx {
	public static void main(String[] args) {
		
		try {
			Animal animal1 = new Dog();
//			changeDog(animal1);
			Dog dog1 = (Dog) animal1;

			Animal animal2 = new Animal();
//			changeDog(animal2);
			Dog dog2 = (Dog) animal2;
			
		}catch(Exception e){
			System.out.println("캐스팅 불가능");
		}
		
	}
	
//	public static void changeDog(Animal animal) {
//		if(animal instanceof Dog) {
//			Dog dog1 = (Dog) animal;
//		}
//	}
}
