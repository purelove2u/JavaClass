package ch4;

public class ArrayTest4 {
	public static void main(String[] args) {
		// int 형 타입의 scores 배열을 선언하고
		// 각각의 방에 78, 85, 95, 80, 70 담기
		
		/*int scores[] = new int[5];
		scores[0] = 78;
		scores[1] = 85;
		scores[2] = 95;
		scores[3] = 80;
		scores[4] = 70;*/
		
		// 배열 선언, 생성, 초기화를 한꺼번에 하는 형태
		// 사용 비중 높음
		int scores[] = {85, 95, 65, 55, 45};
		//int[] scores = {   }   좌측과 같이 대괄호가 앞으로 간 형태도 가능
		
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.println(scores[i]);
		}
			System.out.println();
			
		//향상된 for문
		//for(타입 변수명 : 배열명){
		//		출력문(변수명);
		//}
		for(int i : scores) {
			System.out.println(i);
		}
	}
}
