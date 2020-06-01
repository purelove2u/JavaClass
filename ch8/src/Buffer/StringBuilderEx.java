package Buffer;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder builder1 = new StringBuilder("hello");
		
		builder1.append("world").append("10.5").append(true);
		
		System.out.println(builder1);
		
		System.out.println(builder1.insert(5, "good"));
		
		System.out.println(builder1.delete(0, 5));
		
		System.out.println(builder1.reverse());
	}
}
