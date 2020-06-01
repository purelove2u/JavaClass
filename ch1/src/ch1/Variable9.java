package ch1;

public class Variable9 {

	public static void main(String[] args) {
		// 변수: 하나의 값을 저장하기 위한 메모리 공간
		//		변수는 선언된 블록 내에서만 사용가능
		
		// 자바에서 사용하는 메모리 공간
		// 	- 스택 : 변수가 들어가는 공간
		// 	- 힙 : 객체 생성시 들어가는 공간
		
		// 타입 : 메모리 공간 설정
		// 정수(1~8byte), 실수(4~8byte), 문자(2byte), 논리 = true, false
		
		//정수타입 : byte(1byte), short(2byte), int(4byte), long(8byte)
		
		int v1 = 15;
		int v2 = 0;
		
		if(v1 > 10) {
			v2 = v1 - 10;
		}
		
		int v3 = v1 + 5 + v2;
		
	}

}
