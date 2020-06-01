package classtest;

public class MethodEx1 {

	public static void main(String[] args) {
		Method1 m = new Method1();
		
		//메소드 호출
		int arr[] = {1,2,3,4,5,6};
		m.method5(arr);
		System.out.println(m.method5(arr));
		
		String str[] = {"hello  ", "world  ", "good  ", "bye"};
		System.out.println(m.method6(str));
		
		Box b = new Box(10,9,8);
		m.method7(b);
		
		System.out.println(m.method8(b));

		System.out.println(m.method8(b).getVolume());
	}
}
