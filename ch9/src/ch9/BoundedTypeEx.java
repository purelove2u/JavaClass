package ch9;

public class BoundedTypeEx {
	public static void main(String[] args) {
		int result = BoundedType.compare(new Double(3.14), new Double(4.15));
		// compare : 뒤의 숫자가 더 크면 -1, 앞의 숫자가 더 크면 1/ 같으면 0
		System.out.println(result);
		//BoundedType.compare("a", "b");
	}
}
