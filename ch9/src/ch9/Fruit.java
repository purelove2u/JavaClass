package ch9;

public class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}
class Toy{
	@Override
	public String toString() {
		return "Apple";
	}
}
