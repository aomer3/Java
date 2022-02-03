package v.collections.generics;

public class MyGenericClass<T> {
	
	T obj;
	
	public MyGenericClass(T obj) {
		this.obj = obj;
	}
	
	public void displayObjectDetails() {
		System.out.println("The type of object: " + obj.getClass());
	}
	
	public T getObject() {
		return obj;
	}

}
