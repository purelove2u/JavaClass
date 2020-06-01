package modifier;

public class SingleTon {

	private static SingleTon ston;
	private SingleTon() {
		super();		
	}
	
	static SingleTon getInstance() {
		if(ston == null) {
			ston = new SingleTon();
		}
		return ston;
	}
	
}
