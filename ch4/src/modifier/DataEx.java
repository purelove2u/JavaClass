package modifier;

public class DataEx {

	public static void main(String[] args) {
		Data data = new Data();
		
		data.x = 10;
		System.out.println("main() : x = " + data.x);
		change(data);
		
		System.out.println("main() : x = " + data.x);
		
	}
	
	static Data change(Data d) {
		d.x = 20;
		System.out.println("change() : x = " + d.x);
		return d;
	}

}	
