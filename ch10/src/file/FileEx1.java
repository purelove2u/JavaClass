package file;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		// 자바에서 파일을 다루는 클래스
		File f1 = new File("d:\\temp\\test1.txt");
		File f2 = new File("d:\\temp", "test1.txt");
		File dir = new File("d:\\temp\\");
		File f3 = new File(dir, "test1.txt");
		
		// 주요 메소드
		String fileName = f1.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일명 : " + f1.getName());
		System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, pos));
		System.out.println("확장자 : " + fileName.substring(pos + 1));
		System.out.println("경로를 포함한 파일명 : " + f1.getPath());
		System.out.println("파일의 절대경로 : " + f1.getAbsolutePath());
		System.out.println("파일이 속해있는 디렉토리 : " + f1.getParent());
		
		System.out.println();
		System.out.println("File.pathSeparator : " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar : " + File.pathSeparatorChar);
		System.out.println("File.separator : " + File.separator);
		System.out.println("File.separatorChar : " + File.separatorChar);
	}

}
