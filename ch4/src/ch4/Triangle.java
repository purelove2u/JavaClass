package ch4;

public class Triangle {
	// 필드
	int baseline;// 밑변
	int height;// 높이
	
//	Triangle(){}
//	
	Triangle(int baseline, int height){
		this.baseline = baseline;
		this.height = height;
	}
		
	// 기능 Method getArea()
	// 면적구하기 : return type : doutble
	// 구현 기능 : 클래스의 필드를 이용하여 면적구하기 
	double getArea() {
		return baseline *  height / 2;
	}
}
