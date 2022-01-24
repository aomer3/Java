package c.wrapperClasses;

public class ObjectAndString {
	
	public static void main(String[] args) {
		
		long x = 1000;
		
		//Primitive to Object first
		Long y = Long.valueOf(x);
		
		//Object to String 
		String s = y.toString();
		
		//String to Object
		Long z = Long.valueOf(s);
		
		System.out.println(s.getClass());
		System.out.println(z.getClass());
	}

}
