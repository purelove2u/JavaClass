package lambda;

public class Student {
	private String name;
	private int english;
	private int math;
	public Student(String name, int english, int math) {
		super();
		this.name = name;
		this.english = english;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public int getEnglish() {
		return english;
	}
	public int getMath() {
		return math;
	}	
}
