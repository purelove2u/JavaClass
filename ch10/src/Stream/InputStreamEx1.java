package Stream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {
		
		//바이트 단위의 입력 담당 추상 클래스
		InputStream in = System.in;
		
		try {
			int input = in.read();
			System.out.println((char)input);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
