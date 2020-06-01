package ch4;

public class ArrayTest11 {
	public static void main(String[] args) {
		String str[] = new String[3];
		
		str[0] = "Hello";
		str[1] = "Hello";
		str[2] = new String("Hello");
		
		for(String i : str) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(str[0] == str[1]);
		System.out.println(str[1] == str[2]);
		System.out.println(str[1] .equals(str[2]));

		

	}

}
