package classtest;

public class Box {
	// 속성 : 가로, 세로, 높이
	private int width, vertical, height;

	public Box() {
		super();
	}

	public Box(int width, int vertical, int height) {
		super();
		this.width = width;
		this.vertical = vertical;
		this.height = height;
	}
	
	public int getVolume() {
		return width * vertical * height;
		
	}
}
