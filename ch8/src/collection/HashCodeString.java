package collection;

public class HashCodeString {

	public static void main(String[] args) {
		String obj1 = "안녕하세요";
		String obj2 = "반갑습니다";
		String obj3 = new String("안녕하세요");
		String obj4 = "안녕하세요";
		
		System.out.println("obj1.hashCode : " + obj1.hashCode());
		System.out.println("obj2.hashCode : " + obj2.hashCode());
		System.out.println("obj3.hashCode : " + obj3.hashCode());
		System.out.println("obj4.hashCode : " + obj4.hashCode());

	}

}
