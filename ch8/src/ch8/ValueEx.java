package ch8;

public class ValueEx {

	public static void main(String[] args) {
		Value value1 = new Value(20);
		Value value2 = new Value(20);
		
		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));
		
		System.out.println(value1.toString());
		System.out.println(value2.toString());
	}

}
