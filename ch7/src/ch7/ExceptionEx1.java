package ch7;

public class ExceptionEx1 {

	public static void main(String[] args) {
		//Exception : 프로그램 예외를 의미(로직의 이상, 외부의 입력값에 의해서 발생)
		
		// 처리방식 
		// 1. try-catch문
//			try {}문만 올 수 없음 
			try {} catch(Exception e){} finally{}
			try {} catch(Exception e){}
			try {} finally{}			
		// try : 예외가 날 부분 catch: 예외가나면 해야할 구문 
		// fianlly : 나든 안나든 해야할 일
			
		// 2. exception 던지기 : 메소드를 호출하는 측에서 처리
			
		// catch 구문은 개별적으로 Exception을 처리할 수도 있고
		// 한꺼번에 부모의 타입으로 처리 가능
		// 멀티 catch문으로도 처리 가능
			
		// 강제 예외발생
		// throw new Exception() : 컴파일 단계에서 체크하고 싶을 때
		// throw new RunTimeException() : 런타임 단계에서 체크하고 싶을 때
		// 
	}

}
