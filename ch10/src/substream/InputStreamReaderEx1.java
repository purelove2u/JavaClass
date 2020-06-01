package substream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {

	public static void main(String[] args) {
		
		try(InputStreamReader reader = new InputStreamReader(new FileInputStream("d:\\temp\\test.txt"), "ms949")) {
			int data;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
