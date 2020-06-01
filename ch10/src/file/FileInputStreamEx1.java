package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx1 {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(new File("d:\\temp\\test.txt"));
			OutputStream out = new FileOutputStream("d:\\temp\\result.txt");
			byte b[] = new byte[100];
			while(fis.read(b) != -1) {
				out.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} /*
			 * finally { try { fis.close(); out.close(); } catch (IOException e) {
			 * e.printStackTrace(); } }
			 */
	}
}
