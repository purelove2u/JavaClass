package ch8;

public class PersonEx {
	public static void main(String[] args) {
		Person person1 = new Person("hong12", "홍길동");
		Person person2 = new Person("hong12", "홍길동");
		Person person3 = new Person("hong12", "정준하");
		
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
		
		System.out.println(person1.toString());
		System.out.println(person2);	// toString()은 굳이 호출안해도 된다.
		
	}
}
