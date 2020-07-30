package lambda;

public class LambdaTest3 {
	public static void main(String[] args) {
		// Lambda2 람다식(타겟 타입은 method가 하나인 경우에만 가능)
		Lambda2 lamb = x -> System.out.println(x);
		lamb.method1(10);
		
		lamb = x -> {
			int y = x*x;
			System.out.println(y);
		};
		lamb.method1(100);		
	}
}











