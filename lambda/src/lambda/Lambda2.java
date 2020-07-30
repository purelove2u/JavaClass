package lambda;

@FunctionalInterface  //함수형(적) 인터페이스-추상 메소드가 하나
public interface Lambda2 {
	public void method1(int x);	
//	public void method2();
	
	default void method2() {}
	static void method3() {}
}
