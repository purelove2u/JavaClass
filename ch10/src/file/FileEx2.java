package file;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		// 사용자로부터 인자를 받아들여 디렉토리가 맞는지 확인
		if (args.length != 1) {
			System.out.println("사용법 : java FileEx3 디렉토리명");
			System.exit(0);
		}
		
		File f1 = new File(args[0]);
		if(!f1.exists() || !f1.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] files = f1.listFiles();
		for(int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory()? "[" + fileName + "]" : fileName);
		}

	}

}
