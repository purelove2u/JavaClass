package Buffer;

public class Reverse {

	public static void main(String[] args) {
		String str1 = "AbZquartKho";
		
		// 문자열을 거꾸로 출력하기
		for(int i = str1.length()-1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		
		StringBuffer buffer = new StringBuffer(str1);
		System.out.println(buffer.reverse());
	}
}
