package ch9;

public class Product<T, M> {
	private T kind;
	private M motel;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getMotel() {
		return motel;
	}
	public void setMotel(M motel) {
		this.motel = motel;
	}
}
