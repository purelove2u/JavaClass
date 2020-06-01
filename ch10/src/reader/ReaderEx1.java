package reader;

import java.io.FileReader;

public class ReaderEx1 {

	public static void main(String[] args) {
		try(FileReader reader = new FileReader("d:\\temp\\test.txt")) {
			int input;
			while((input = reader.read()) != -1) {
				System.out.println((char)input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
