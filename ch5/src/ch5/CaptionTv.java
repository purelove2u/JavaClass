package ch5;

public class CaptionTv extends Tv {
	// 색상, 전원상태, 채널, 캡션상태 가 필요
	// |----Tv에서 상속---|, 추가생성
	/*private*/ boolean caption;	//캡션 상태
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
