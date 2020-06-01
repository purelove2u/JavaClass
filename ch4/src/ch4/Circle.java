package ch4;

public class Circle {
	// 반지름(radius)
	int radius;
	
	// 면적을 구한다(getArea()) - return double
	Circle(){}
	Circle(int radius){
		this.radius = radius;
	}
	
	double getArea(int radius) {
		return radius * radius * Math.PI;
	}
}
