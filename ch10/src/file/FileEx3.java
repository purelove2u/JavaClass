package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {

	public static void main(String[] args) {
		File upload = new File("d:\\upload");
		File dir = new File("d:\\upload\\dir");
		File file1 = new File("d:\\upload\\file1.txt");
		File file2 = new File("d:\\upload\\file2.txt");
		File file3 = new File(upload, "file3.txt");
		
		if( !upload.exists()) {
			upload.mkdirs();
		}
		if( !dir.exists()) {
			dir.mkdirs();
		}
		try {
			if( !file1.exists())	file1.createNewFile();
			if( !file2.exists())	file2.createNewFile();
			if( !file3.exists())	file3.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		System.out.println(" 날짜	시간		형태		크기		이름");
		
		File[] contents = upload.listFiles();
		for(File f: contents) {
			System.out.print(sdf.format(new Date(f.lastModified())));
			if(f.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + f.getName());
			}else {
				System.out.print("\t\t\t" + f.length() + "\t" + f.getName());
			}
			System.out.println();
		}
	}
}
