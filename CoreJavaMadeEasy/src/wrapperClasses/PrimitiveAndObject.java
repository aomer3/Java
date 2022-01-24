package c.wrapperClasses;

public class PrimitiveAndObject {
	
	public static void main(String[] args) {
		
		int x = 100;
		
		//Turns Primitive to Object
		Integer y = Integer.valueOf(x);
		
		//Turns Object to Primitive
		int z = y.intValue();
		
		System.out.println(y.getClass());
	}

}
