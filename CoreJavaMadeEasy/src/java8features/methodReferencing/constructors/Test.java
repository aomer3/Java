package x.advancedTopics.java8features.methodReferencing.constructors;

public class Test {
	
	public static void main(String[] args) {
		
		//Referencing a constructor using lambdas
		MyInterface f1 = s->new MyClass(s);
		f1.get("using lambdas");
		
		//Referencing a constructor using ::
		MyInterface f2 = MyClass::new;
		f2.get("using constructor mapping");
	}

}
