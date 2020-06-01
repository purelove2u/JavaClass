package ch5;

public class DMBCellPhoneEx {

	public static void main(String[] args) {
		DMBCellPhone dmb = new DMBCellPhone();
		
		dmb.channel = 10;
		dmb.color = "white";
		dmb.model = "자바폰";
		
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		
		System.out.println("채널 : " + dmb.channel);
		
		dmb.powerOn();
		dmb.changechannelDmb(15);
		dmb.bell();
		
		
	}

}
