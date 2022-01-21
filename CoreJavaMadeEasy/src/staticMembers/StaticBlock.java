package a.staticMembers;

public class StaticBlock {

	public static void main(String[] args) {

		System.out.println("Hello World");
	}

	// Static blocks will be executed before main method, static block is called once
	// compared to non-static blocks that are called each time an object is created
	static {
		System.out.println("Static Block 1");
	}
	
	static {
		System.out.println("Static Block 2");
	}

}
