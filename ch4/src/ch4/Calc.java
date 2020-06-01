package ch4;

// 두 수를 받아 사칙연산 하는 프로그램
public class Calc {
	int num1;	//첫번째 숫자를 받을 필드
	int num2;	//두번째 숫자를 받을 필드

	Calc(){}
	
	Calc(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// 리턴 없음(=호출만 가능)
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int add(int num1, int num2) {
		int result = num1 + num2;
		return result;	//result가 int이므로 void 에서 int로 변경
	}
	int subtrac(int num1, int num2) {
		return num1 - num2;	// result 변수 없이 바로 리턴으로 보냄
	}
	int multiply(int num1, int num2) {
		return num1 * num2;
	}
	// 나누기 : num1 / num2 결과를 double 타입으로 리턴
	double divide(int num1, int num2) {
		return (double)num1 / num2;	// double을 해줘야 결과 자체가 double이 됨
	}					// 10 / 3 = 3.0	  (double)10.0 / 3 = 3.3333
}
