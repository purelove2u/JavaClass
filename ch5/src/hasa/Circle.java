package hasa;

// has-a : 다른 클래스를 멤버 변수로 선언하여 가지고 있는 형태

public class Circle {
	Point point;//= new Point(100, 115);// x, y좌표, 반지름
	int r;

	public Circle(int r) {
		super();
		this.r = r;
	}
	public Circle(Point point, int r) {
		super();
		this.point = point;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("center = (%d, %d), r = %d", point.x, point.y, r);
	}
	
}

// 원은 점을 가지고 있다 => has a
// 원은 점이다 => is a
