package ch6;

public class RemoteControlEx {

	public static void main(String[] args) {
		
		//Television television = new Television();
//		RemoteControl television = new Television();
//		television.turnon();
//		television.setVolume(5);
//		television.turnoff();
//		
		//Audio audio = new Audio();
//		RemoteControl audio = new Audio();
//		audio.turnon();
//		audio.setVolume(5);
//		audio.turnoff();	
	
		RemoteControl television = new SmartTv();
		television.turnon();
		television.setVolume(5);
		television.turnoff();
	
//		RemoteControl smarttv = new SmartTv();
//		smarttv.turnon();
//		smarttv.setVolume(5);
//		smarttv.turnoff();
		
		// 익명구현객체 => 실제로 인터페이스를 구현하는 객체를 생성하지 않고
		// 1회성으로 사용하는 방식
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnon() {
				System.out.println("켭니다.");
			}
			@Override
			public void turnoff() {
				System.out.println("끕니다.");
			}
			@Override
			public void setVolume(int volume) {
				System.out.println("현재 볼륨 : " + volume);
			}
			
		};	// 문장으로 취급하기 때문에 ; 를 붙여줘야함
		
		//사용
		rc.turnon();
		rc.setVolume(5);
		rc.turnoff();
	}
}
