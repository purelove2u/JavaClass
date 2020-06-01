package ch1;

public class Variable11 {

	public static void main(String[] args) {
		// 이스케이프 문자 => \n, \t, \r, \', \"
		System.out.println("아름다운\t 야경입니다.");	// tab 한 번
		System.out.println("아름다운\n 야경입니다.");	//	줄바꿈
		System.out.println("아름다운\r 야경입니다.");	// 
		System.out.println("\"아름다운 야경입니다.\"");	// (")출력. (\)다음문자 문법 무시하고 출력
		System.out.println("\'아름다운 야경입니다.\'");	// (')출력.
		System.out.println("아름다운\\ 야경입니다.");	// (\)출력. 

	}

}
