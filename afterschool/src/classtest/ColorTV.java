package classtest;

public class ColorTV extends TV {
	private int colors;

	public ColorTV(int size, int colors) {
		super(size);
		this.colors = colors;
	}
	
	int getColors() {
		return colors;
	}

	void printProperety() {
		System.out.println(this.getSize() + "인치 " + colors + "컬러");
	}
}
