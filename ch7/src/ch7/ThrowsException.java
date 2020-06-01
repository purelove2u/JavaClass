package ch7;

public class ThrowsException {
	public static void main(String[] args) {
		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test() throws ClassNotFoundException {
		Class.forName("");
		
	}
}
