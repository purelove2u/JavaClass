package classtest;

public class IPTV extends ColorTV {
	private String ip;

	public IPTV(int size, int colors, String ip) {
		super(size, colors);
		this.ip = ip;
	}
	
	@Override
	void printProperety() {
		System.out.println("나의 IPTV는 " + ip + " 주소의 " 
	+ this.getSize() + "인치 " + this.getColors() + "컬러");
	}
}
