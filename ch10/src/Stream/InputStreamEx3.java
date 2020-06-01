package Stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {

	public static void main(String[] args) {
		
		//바이트 단위의 입력 담당 추상 클래스
		InputStream in = System.in;
		//바이트 단위의 출력 담당 추상 클래스
		OutputStream out = System.out;
		
		byte[] b = new byte[100];
		
		try {
			int input = 0;
			// 입력스트림으로부터 읽은 바이트들을 매개값으로
			// 주어진 배열에 저장한 후 실제로 읽은 바이트 수를 리턴
			while((input = in.read()) != -1) {
				//System.out.println(input);
				out.write(b);
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
