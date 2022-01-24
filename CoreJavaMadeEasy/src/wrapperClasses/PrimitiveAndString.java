package c.wrapperClasses;

public class PrimitiveAndString {
	
	public static void main(String[] args) {
		
		byte x = 100;
		
		//Turns Primitive to String
		String s = Byte.toString(x);
		
		//Turns String to Primitive
		byte y = Byte.parseByte(s);
		
		System.out.println(s.getBytes());
		System.out.println( ((Object) y).getClass() );
	}

}
