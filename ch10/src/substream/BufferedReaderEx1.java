package substream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		try (InputStreamReader fis = new InputStreamReader(new FileInputStream("d:\\temp\\test.txt"), "ms949");
			BufferedReader bis = new BufferedReader(fis);
			FileWriter fos = new FileWriter("d:\\temp\\test17.txt");
			BufferedWriter bos = new BufferedWriter(fos)){
			
			String str;
			while((str = bis.readLine()) != null) {
				bos.write(str);
				bos.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
