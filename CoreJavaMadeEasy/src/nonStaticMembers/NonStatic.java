package a.nonStaticMembers;

public class NonStatic {
	
	int num;

	// Constructor is a method that has the same name as the class name, has no return type,
	// may or may not have input arguments. Used to create an object instance of a class 
	public NonStatic() {
		System.out.println("Inside the constructor");
	}
	
	//Non-static block - will get called each time before the constructor by the main method
	{
		System.out.println("Inside the non-static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
		
		NonStatic ns = new NonStatic();
		ns.doSomething();
	}
	
	// Static blocks will be executed before main method, static block is called once
    // compared to non-static blocks that are called each time an object is created
	static {
		System.out.println("Inside the static block");
	}
	
	void doSomething() {
		System.out.println("Inside doSomething");
	}

}
