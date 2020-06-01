package ch9;

public class Container<K, V> {
	private K k;
	private V v;
	
	void set(K k, V v){
		this.k = k;
		this.v = v;
	}
	
	public K getKey(){
		return k;
	}
	
	public V getValue(){
		return v;
	}
}
