package Buffer;

public class Delete {
	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer("0123456");
		System.out.println(buffer1.delete(3, 6));
		
		buffer1.insert(4, ".");
		System.out.println(buffer1);
		
		buffer1.replace(1, 3, "AV");
		System.out.println(buffer1);
		
	}
}
