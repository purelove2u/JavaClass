package ch7;

public class ArrayIndexException {
	public static void main(String[] args) {
		//UncheckedException
		//java.lang.ArrayIndexOutBoundsException
		try {
//			System.out.println(args[0]);
//			System.out.println(args[1]);
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
		}	

		catch(NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("인자 값을 확인해주세요.");
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("사용법 : java 클래스명 인자1 인자2");
//		}
	}
}
