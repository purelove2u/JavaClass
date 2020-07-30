package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaTest10 {	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동",90,96),
			new Student("김수정",80,85));	
	
	public static void printString(Function<Student, String> function) {
		//Student 객체에서 학생의 이름만 출력하기
		for(Student stu : list) {
			System.out.println(function.apply(stu));
		}
	}
	public static void printInt(ToIntFunction<Student> function) {
		//Student 객체에서 학생의 점수만 출력하기
		for(Student stu : list) {
			System.out.println(function.applyAsInt(stu));
		}
	}	
	public static void main(String[] args) {
		System.out.println("==== [학생이름] ====");
		printString(obj -> obj.getName());
		System.out.println();
		System.out.println("==== [영어 점수]===");
		printInt(obj -> obj.getEnglish());
		System.out.println();
		System.out.println("==== [수학 점수]===");
		printInt(obj -> obj.getMath());
	}
}












