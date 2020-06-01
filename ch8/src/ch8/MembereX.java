package ch8;

public class MembereX {
	public static void main(String[] args) {
		Member member1 = new Member("hong");
		Member member2 = new Member("hong");
		
		System.out.println(member1.equals(member2));
		System.out.println(member1.toString());
		System.out.println(member2.toString());
	}
}
