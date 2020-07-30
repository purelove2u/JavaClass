package lambda;

import java.util.function.BiFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class LambdaTest9 {
	public static void main(String[] args) {
		//기본형을 사용하는 함수형 인터페이스
		DoubleToIntFunction f = d -> (int)d;
		System.out.println(f.applyAsInt(3.5));
		
		// String -> int
		//ToIntFunction<String> f1 = x -> Integer.parseInt(x);
		ToIntFunction<String> f1 = Integer::parseInt;
		System.out.println(f1.applyAsInt("35"));
		
		// int -> String
		//IntFunction<String> f2 = i -> String.valueOf(i);
		//                       클래스명::메소드명
		IntFunction<String> f2 = String::valueOf;
		System.out.println(f2.apply(25));
		
		//두개의 문자열을 받아서 같은 문자열인지 비교
		//BiFunction<String, String, Boolean> f3 = (s1, s2) -> s1.equals(s2);
		BiFunction<String, String, Boolean> f3 = String::equals;
		System.out.println(f3.apply("hello", "Hello"));
		
	}
}













