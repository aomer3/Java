package h.packages.outsidethepackage;

import h.packages.insidethepackage.A;

public class C {
	
	public static void main(String[] args) {
		
		//Classes from another package can only be accessed in two ways:
		
		//Method 1: using import statement 
		A.a1();
		
		//Method 2: Using fully qualified name 
		h.packages.insidethepackage.A.a1(); 
		
		A objectA = new A();
		objectA.a2();
	}

}
