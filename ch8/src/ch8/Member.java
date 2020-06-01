package ch8;

public class Member {
	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			return this.id.equals(m.id);
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return id;
	}
}
