package x.advancedTopics.java8features.methodReferencing;

public class MyClass {
	
	public void method2(int i) {
		System.out.println("methodRef/" + i);
	}
	
	public static void main(String[] args) {
		
		//Lambda expression vs Method referencing with ::
		
		//lambda expression implements the interface 
		MyInterface f = i->System.out.println("lambda/"+i);
		f.f1(10);
		
		//:: maps a class method to a function interface's method
		MyClass c = new MyClass();
		MyInterface mi = c::method2;
		mi.f1(9);
		
		
		
		
	}

}
