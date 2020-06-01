package ch2;

public class CompareOperEx3 {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = new String("홍길동");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
	}

}
