package poly;

public class CaptionTvEx {

	public static void main(String[] args) {
		Tv tv = new CaptionTv();	// 부모의 참조변수로 자식객체를 가져옴.
		
		// 부모가 가지고있는 멤버변수나 메소드로 범위 제한
		tv.channel = 7;
		tv.color = "black";
		tv.power = true;
		
		tv.channelUp();
		tv.channelUp();			
		
		
	}

}
