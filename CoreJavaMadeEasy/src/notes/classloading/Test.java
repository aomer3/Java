package y.notes.classloading;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {

		//Dynamically loading class into memory and getting back all of its methods
		Class<?> c = Class.forName("y.notes.User");
		Method[] methods = c.getDeclaredMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println(methods.length);
	}
}
