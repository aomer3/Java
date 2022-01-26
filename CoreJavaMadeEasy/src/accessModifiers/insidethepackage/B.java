package g.accessModifiers.insidethepackage;

public class B {
	
	public static void main(String[] args) {
		
	A objectA = new A();
	
//	System.out.println(objectA.a); //error = private classes members not accessible 
	System.out.println(objectA.b); //package modifier accessible within the same package
	System.out.println(objectA.c); //protected modifier accessible within the same package
	System.out.println(objectA.d); //public modifier, can be accessed anywhere
		
	}

}
