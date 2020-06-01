package ch9;

public class BoxEx3 {

	public static void main(String[] args) {
		Box3<Fruit> fruitBox = new Box3();
		Box3<Apple> appleBox = new Box3();
		Box3<Toy> toyBox = new Box3();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		//fruitBox.add(new Toy());
		
		appleBox.add(new Apple());
		//appleBox.add(new Grape());	
	}
}
