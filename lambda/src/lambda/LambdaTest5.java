package lambda;

public class LambdaTest5 {
	//함수형 인터페이스도 리턴타입이나 매개변수로 쓰일 수 있다.
	static void execute(Lambda4 lamb) {
		lamb.run();
	}	
	static Lambda4 getRun() {
		Lambda4 lamb = () -> System.out.println("함수형 인터페이스 리턴");
		return lamb;
	}	
	public static void main(String[] args) {
		Lambda4 lamb = () -> System.out.println("lamb.run()");
		lamb.run();
		System.out.println();
		System.out.println("-----------------------");
		execute(getRun());
		System.out.println("-----------------------");
	}
}







