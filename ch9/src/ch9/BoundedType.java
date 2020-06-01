package ch9;

public class BoundedType {
	public static <T extends Number> int compare(T t1, T t2) { 
		// Numbber의 자식타입만 지정가능
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
}
