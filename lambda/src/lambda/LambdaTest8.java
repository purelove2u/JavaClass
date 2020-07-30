package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest8 {
	public static void main(String[] args) {
		// ~~~Consumer => void accept(T t);
		Consumer<Integer> consumer = i -> System.out.println(i);
		consumer.accept(15);
		
		// ~~~Supplier : T get();
		Supplier<Integer> supplier = () -> (int)(Math.random()*100)+1;
		System.out.println(supplier.get());
		
		// ~~~Predicate : boolean test(T t);
		Predicate<Integer> predicate = i -> i > 10;
		System.out.println(predicate.test(25));
		
		// ~~~~Function : R apply(T t); 
		Function<Integer, Integer> function = i -> i/10*10;
		System.out.println(function.apply(561));
		
		
		// String 타입의 숫자를 받아서 Integer 로 리턴
		Function<String, Integer> function2 = s -> Integer.parseInt(s);
		System.out.println(function2.apply("256")+31);
		
		// String 타입의 문자를 받아서 문자의 길이가 0이라면 true
		Predicate<String> predicate2 = s -> s.length() == 0;
		System.out.println(predicate2.test("안녕하세요"));
		System.out.println(predicate2.test(""));
		
		// String 타입의 매개변수를 출력하기
		Consumer<String> consumer2 = s -> System.out.println(s);
		consumer2.accept("반갑습니다.");
		
		
		// 두 개의 인자를 받아서 덧셈 연산을 실행 후 결과 리턴
		BiFunction<Integer, Integer, Integer> f = (x, y) -> x + y;
		System.out.println("연산 수행 : "+f.apply(35, 25));
		
		// 두 개의 String 타입을 받아서 연결한 후 결과 리턴
		BiFunction<String, String, String> f1 = (s1, s2) -> s1.concat(s2);
		System.out.println("문자열 연결 수행 : "+f1.apply("java8", "람다"));
		
		// 두 개의 Integer 타입을 받아서 큰 수를 출력
		BiConsumer<Integer, Integer> c1 = (x,y) -> 
									System.out.println(x > y ? x : y);
		c1.accept(25, 30);
	}
}











