package modifier;

public class Earth {
	// static final 순서 바뀌어도 무관
	// 상수 선언은 대문자로 하는 것이 관례
	final static double EARTH_RADIUS = 6500;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}
