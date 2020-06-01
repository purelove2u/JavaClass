package ch1;

public class Variable8 {
	public static void main(String[] args) {
		//변수명을 짓는 규칙
		//1. 첫번째 글자는 문자로 시작/ 특수문자는 $, _ 만 허용
		//2. 대소문자 구별(주로 변수명은 소문자로 시작)
		//3. 첫문자는 소문자로 시작, 다른 단어가 붙을 경우 두번째 단어는 대문자로 시작
		//	ex) maxSpeed, firstName, carBodyColor  => Camel Case
		//  cf) max_speed, first_name, car_body_color => Snake Case
		//4. 문자 수 제한 없음
		//5. 예약어 사용불가 ex) class, static, void, main.....
		
		byte var1 = -128;
		// cannot convert from int to byte
		// byte(1byte = 8bit = 2^8 = 256개 사용가능) : -128 ~ 127(음수 127개 + 양수 127개 + 0 = 255개)
		
		//byte var2 = 128;   오류(int type 범위의 숫자)
		
		
	}
}
