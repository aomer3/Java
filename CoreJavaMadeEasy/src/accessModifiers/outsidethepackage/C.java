package g.accessModifiers.outsidethepackage;
import g.accessModifiers.insidethepackage.*;

public class C extends A {
	
	public static void main(String[] args) {
				
	C objectC = new C();
	
//	System.out.println(objectC.a); //error = private classes members not accessible 
//	System.out.println(objectC.b); //error = package level not accessible outside package
	System.out.println(objectC.c); //protected class members accessible if inherited
	System.out.println(objectC.d); //public class members accessible everywhere
	}
}
