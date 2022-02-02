package q.innerclasses.staticInnerClass;

public class Outer {
	
	static void f1() {
		System.out.println("Outers Static method");
	}
	
	static class Inner{
		static void f2() {
			System.out.println("Inners Static method");
		}
		
		void f3() {
			System.out.println("Nonstatic method inside inner class");
		}
	}

	public static void main(String[] args) {
		
		Outer.f1();
		
		//calling static inner class
		Outer.Inner.f2();
		
		//calling non-static inner class
		Outer.Inner inner = new Outer.Inner();
		inner.f3();
	}
}

