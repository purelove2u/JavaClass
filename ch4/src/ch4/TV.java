package ch4;

// 이름규칙
// 클래스명 : 대문자로 시작
// 변수명/메소드명 : 소문자로 전부 만든다
// sumRange (Camel case) - Java
// sum_range (snake case) - DB


public class TV {
	
	// 멤버변수(인스턴스 변수), 속성, 객체변수.......
	// 타입(기본타입(int, float등), 참조타입(array 등) 변수명;
		int channel;
	String[] names;	//or String names[];
	
	// 생성자
	// 접근제한자 클래스명(){}
	public TV() {}	//리턴 타입이 없음, 반드시 클래스와 같은 이름
	
	
	// 메소드
	// 리턴타입((기본타입(int, float...), 참조타입(array... ), void) 메소드명(){}
	int sum() {
		return 0;
	}
	
	void method1() {		//void 리턴 값 업어도 됨
		
	}
	
}
