package sec02.exam01_generic_type;
/*
public class box {
// �ʵ� ������ �޼���

	private Object object;

	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
	
}

*/

public class box<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;

	}
}
