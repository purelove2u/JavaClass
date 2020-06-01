package modifier;

public class PersonEx {

	public static void main(String[] args) {
		Person person = new Person("010209", "hong");
		
		person.name = "kang";
		
		// 초기화 값을 변경할 수 없음
		//person.nation = "America";
		
		person.print();
		
		person.print2();
		
	}

}
