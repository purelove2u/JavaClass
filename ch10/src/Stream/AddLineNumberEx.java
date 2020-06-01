package Stream;

import java.io.BufferedReader;
import java.io.FileReader;


public class AddLineNumberEx {

	public static void main(String[] args) {
		String filePath = "D:\\JavaSource\\ch10\\src\\Stream\\InputStreamEx1.java";
		try(FileReader fr = new FileReader(filePath);
			BufferedReader br  = new BufferedReader(fr)) {
			
			String str = null;
			int i = 1;
			while((str = br.readLine()) != null) {
				System.out.print((i++) + " : ");
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
