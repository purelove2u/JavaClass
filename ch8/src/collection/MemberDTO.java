package collection;

// ~~DTO (Data Transfer Object)
// !! VO (Value Object)

public class MemberDTO {
	private String id;
	private String name;
	private String addr;
	public MemberDTO(String id, String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	

}
