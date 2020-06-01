package modifier;

public class SingleTonEx {

	public static void main(String[] args) {
		//SingleTon singleton = new SingleTon();
		SingleTon singleton = SingleTon.getInstance();
		SingleTon singleton1 = SingleTon.getInstance();
		SingleTon singleton2 = SingleTon.getInstance();
		System.out.println(singleton1 == singleton2);
		
	}

}
