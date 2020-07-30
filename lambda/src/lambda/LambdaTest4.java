package lambda;

public class LambdaTest4 {
	public static void main(String[] args) {
		Lambda3 lamb = (a,b) -> a > b ? a : b;
		System.out.println("최대값 : "+lamb.max(25, 30));
	}
}
