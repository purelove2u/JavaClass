package Stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		
		//바이트 단위의 입력 담당 추상 클래스
		InputStream in = System.in;
		//바이트 단위의 출력 담당 추상 클래스
		OutputStream out = System.out;
		
		try {
			int input = 0;
			while((input = in.read()) != -1) {
				//System.out.println(input);
				out.write(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
