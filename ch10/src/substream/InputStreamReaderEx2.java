package substream;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputStreamReaderEx2 {

	public static void main(String[] args) {
		
		try(InputStreamReader reader = new InputStreamReader(new FileInputStream("d:\\temp\\test.txt"), "ms949");
			FileWriter writer = new FileWriter("d:\\temp\\test16.txt")) {
			int data;
			while((data = reader.read()) != -1) {
				writer.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
