package Buffer;

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer();
		StringBuffer buffer2 = new StringBuffer(20);
		StringBuffer buffer3 = new StringBuffer("hello world");
		StringBuffer buffer4 = new StringBuffer("hello world");
		
		System.out.println(buffer3 == buffer4);
		System.out.println(buffer3.equals(buffer4));
		
		// StringBuffer 에서 String으로 변환
		String str1 = new String(buffer3);
		String str2 = buffer4.toString();
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		
	}
}
