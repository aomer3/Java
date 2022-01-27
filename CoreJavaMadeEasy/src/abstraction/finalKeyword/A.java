package j.abstraction.finalKeyword;

//1. Final class = because A is a final class, B cannot extend or implement it
public final class A {

	final float pi = 3.14f; //constant
	
	public static void main(String[] args) {
		
		//2. Final object = because a1 is a final object, it's reference cannot be changed
		final A a1 = new A();
		//a1 = new A();
		
		//3. Final field = because pi is a final field, it's value cannot be changed 
		//a1.pi = 3.25f; 
	}
	
	
}
