package classtest;

public class PersonEx {

	public static void main(String[] args) {
		// Person 인스턴스(객체) 생성
		Person person = new Person();
		
		person.setName("홍길동");
		person.setHeight(185.8);
		person.setWeight(65.9);
		person.setAddress("서울시 노원구 동일로");
		
		System.out.println(person.getName());
		System.out.println(person.getHeight());
		System.out.println(person.getWeight());
		System.out.println(person.getAddress());
	}
}
