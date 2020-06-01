package ch8;

public class SubString {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // 0<= >6
		System.out.println(firstNum);
		
		String lastNum = ssn.substring(7, 14);
		System.out.println(lastNum);
	}
}
