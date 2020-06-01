package ch8;

public class FindKim {
	public static void main(String[] args) {
		String names[] = {"Queen", "Tod", "Kim", "Park", "Choi"};
		
		System.out.println(findKim(names));
		
	}
	
	public static String findKim(String seoul[]) {
		//넘겨받은 배열에서 Kim이라는 문자열의 위치를 찾아
		//Kim은 3번째 위치에 있다 라는 문자열을 리턴하는 메소드
		int i = 0;
		for(i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				break;
			}
		}
		return "Kim은 " + (i+1) + "번째 위치에 있다.";
	}
}
