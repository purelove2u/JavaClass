package ch8;

public class StringEx {
	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		// 확장자를 제외한 파일명 출력
//		String file = fullName.substring(0, 5);
//		System.out.println(file);
		
		int index = fullName.indexOf(".");
		String fileName = fullName.substring(0, index);
		System.out.println(fileName);
		// 확장자만 출력
//		String java = fullName.substring(6);
//		System.out.println(java);
		
		String ext = fullName.substring(index + 1);
		System.out.println(ext);
	}
}
