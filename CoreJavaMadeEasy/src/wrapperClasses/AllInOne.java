package c.wrapperClasses;

public class AllInOne {
	
	public static void main(String[] args) {
		int x = 100;
		
		//Primitive to String
		String y = Integer.toString(x);
		
		//Primitive to Object
		Integer m = Integer.valueOf(x);
		
		//String to Object
		Integer b = Integer.valueOf(y);
		
		//String to Primitive
		int i = Integer.parseInt(y);
		
		//Object to Primitive
		int z = b.intValue();
		
		//Object to String
		String n = b.toString();
		
		
		
		System.out.println(n);
	}

}
