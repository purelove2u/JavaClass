package collection;

public class StudentV0 {
	private int num;
	private String name;
	public StudentV0(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return num + " : " + name;
	}
	@Override
	public int hashCode() {
		// String이 정의한 hashCode()값
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentV0) {
			StudentV0 vo = (StudentV0) obj;
			return this.name.equals(vo.name);
		}
		return false;
	}

}
