package y.notes.annotations;

import java.util.ArrayList;
import java.util.List;

public class B extends A {
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) {
		
		A a = new A();
		a.myMethod();
		a.myMethod2();
		
		a.setName("Jack");
		System.out.println(a.getName());
		
		
		List list = new ArrayList();
		System.out.println(list);
		
	}

}
