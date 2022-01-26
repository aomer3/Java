package h.packages.insidethepackage;

import h.packages.insidethepackage.subpackage.E;

public class B {
	
	public static void main(String[] args) {
		
		//Accessing another package
		A.a1(); //static method can be accessed without object creation
		
		A objectA = new A();
		objectA.a2();
		
		//Accessing a sub-package
		E objectE = new E(); //sub-packages must be imported
		objectE.e1();
		
		
	}

}
