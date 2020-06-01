package ch4;

public class Calculator {
	// Overloading : 하나의 클래스에 동일한 이름으로 존재
	// Constructor Overloading
	// Method Overloading
	// 반드시 인자의 개수가 달라야 함.
	
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}

}
