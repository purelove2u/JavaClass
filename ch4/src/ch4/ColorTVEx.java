package ch4;

public class ColorTVEx {
	public static void main(String[] args) {
		// 객체 생성
		ColorTV tv = new ColorTV();
		// 기본 생성자는 생성자가 하나도 없을 때는 
		// 컴파일러가 자동 생성
		// ColorTV 클래스에 기본 생성자가 없어도
		// 객체 생성시 에러가 나지 않음
		
		// 객체 사용
		tv.channel = 7;
		tv.color = "black";
		tv.power = true;
		tv.channelDown();
		System.out.println("현재 채널 : " + tv.channel);
		
		
	}
}
