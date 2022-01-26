package g.accessModifiers.outsidethepackage;

import g.accessModifiers.insidethepackage.A;

public class D {
	
	public static void main(String[] args) {
		
	A objectA = new A();
		
//	System.out.println(objectA.a); //error = private classes members not accessible
//	System.out.println(objectA.b); //error = package level not accessible outside package
//	System.out.println(objectA.c); //protected class members inaccessible if not inherited
	System.out.println(objectA.d); //public class members accessible everywhere
	}

}
