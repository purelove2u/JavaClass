package substream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamEx1 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("d:\\temp\\picture.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("d:\\temp\\picture15.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			int data;
			long start = System.currentTimeMillis();
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("걸린 시간 : " + (end - start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
