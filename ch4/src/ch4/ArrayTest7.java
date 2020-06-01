package ch4;

public class ArrayTest7 {
	public static void main(String[] args) {
		// 1~45 번호 생성 후 배열에 담기
		int card[] = new int[45];
		
		for(int i = 0 ; i < card.length ; i++) {
			card[i] = i + 1;
			
		}
		
//		for(int i : card) {				안됨.
//			card[i] = i + 1;			i = card[i] 이기 때문
//		}
		
		
		for(int i : card) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//카드 섞기
		/*
		for(int i = 0 ; i < card.length ; i++) {
			//임의의 위치
			int pos = (int)(Math.random() * 45);	//인덱스의 범위가 0~44이기 때문에 +1을 하지 않음.
			int temp = card[i];
			card[i] = card[pos];
			card[pos] = temp;

		}for(int i : card) {
			System.out.print(i + " ");
		}
		*/
		System.out.println();
		
		  
		for(int i = 0 ; i < card.length ; i++) {
			int pos = (int)(Math.random() * 45+1);
			card[i] = pos;
			for(int j = 0 ; j < i ; j++) {
				if(card[i] == card[j]) {
					i = i - 1;
				}
			}
		}
			
		
							
		for(int i : card) {
			System.out.print(i + " ");
		}
		
		
		
	}
}
