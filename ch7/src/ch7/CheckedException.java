package ch7;

public class CheckedException {

	public static void main(String[] args) {
		// 컴파일 단계에서 Exception 여부 확인
		try {
			Class.forName("");			
		}catch(ClassNotFoundException e) {
			// e.printStackTace();
			System.out.println("클래스 명을 확인해주세요");
		}

		
		
		
	}

}
