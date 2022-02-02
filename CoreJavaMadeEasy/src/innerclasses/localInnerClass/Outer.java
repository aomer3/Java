package q.innerclasses.localInnerClass;

public class Outer {
	
	//Local Inner class is a class defined in a constructor, method or block and can only 
	//be accessed in this context
	void f1() {
		
		System.out.println("Inside Outer class method ");
		
		class LocalInner {
			
			//f2() can only be invoked inside f1() and after first creating a LocalInner object
			void f2() {
				System.out.println("Inside Local Inner class f2 method");
			}
		}
		
		
		LocalInner li = new LocalInner();
		li.f2();
	}


	public static void main(String[] args) {
	
		Outer outer = new Outer();
		outer.f1();
	}	
}

