package ch8;

public class CharAt3 {

	public static void main(String[] args) {
		String str1 = "자바 프로그래프";
		
		// 문자열에 '프'가 있는지 확인하는 프로그램
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == '프') {
				System.out.println(i + "번 인덱스에 위치함");
			}
		}
	}
}
