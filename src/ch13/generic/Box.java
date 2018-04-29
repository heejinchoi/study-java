package ch13.generic;

/*	
//Object 타입
public class Box {

    private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}	
	
}
*/

//제네릭 타입
public class Box<T>{
private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}	
}