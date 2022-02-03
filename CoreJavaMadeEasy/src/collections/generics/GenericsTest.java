package v.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
	
	public static void main(String[] args) {
		
		//Generics are compile time, not runtime
		//Type erasure = compiler will use the Generics at compile time to make sure correct
		//data type is added and after that will remove it. This is to ensure backward compatability
		//for older versions of Java where Generics was not supported and may cause issues
		List<String> list = new ArrayList<>();
		
		MyGenericClass<String> s = new MyGenericClass("Jack");
		s.displayObjectDetails();
		System.out.println(s.getObject());
		
		MyGenericClass<Integer> i = new MyGenericClass(123);
		i.displayObjectDetails();
		System.out.println(i.getObject());
		
		MyGenericClass<Integer> d = new MyGenericClass(23.50);
		d.displayObjectDetails();
		System.out.println(d.getObject());
		
	}

}
