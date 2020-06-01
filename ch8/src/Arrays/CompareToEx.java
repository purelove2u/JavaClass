package Arrays;

public class CompareToEx {

	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "b";
		String str3 = "c";
		
		// a - b = 97 - 98
		System.out.println(str1.compareTo(str2));
		
		// a - c = 97 - 99
		System.out.println(str1.compareTo(str3));

	}

}
