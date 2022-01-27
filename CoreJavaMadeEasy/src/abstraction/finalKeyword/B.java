package j.abstraction.finalKeyword;

public class B {
	
	final static float pi = 3.14f; //4. Static keyword = constants often need to be shared 
	
	//5. Final method = a method marked finally cannot be overriden by a child class 
	public final void displayValue() {
		System.out.println(B.pi);
	}

	public static void main(String[] args) {
		
		B b = new B();
		b.displayValue();
	}
}
