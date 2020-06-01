package ch8;

public class IndexOf {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
				
		
		// 위치를 돌려주는 메소드
		// 못찾으면 -1 돌려줌
		System.out.println("str.indexOf(3) : " + str.indexOf(3));
		System.out.println("str.indexOf(프) : " + str.indexOf("프"));
		
		System.out.println("str.indexOf(프라자) : " + str.indexOf("프라자"));
		
		if(str.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련없는 책");
		}
	}
}
