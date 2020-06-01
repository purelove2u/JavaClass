package collection;

public class HashCodeInteger {

	public static void main(String[] args) {
		Integer obj1 = new Integer(15);
		Integer obj2 = 25;
		Integer obj3 = 15;
		
		System.out.println("obj1.hashCode : " + obj1.hashCode());
		System.out.println("obj2.hashCode : " + obj2.hashCode());
		System.out.println("obj3.hashCode : " + obj3.hashCode());
	}

}
