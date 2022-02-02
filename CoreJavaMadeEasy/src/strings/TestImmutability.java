package r.strings;

public class TestImmutability {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		System.out.println("Before concat: " + "\n" + "s1:" + s1.hashCode() + "\n" + "s2:" + s2.hashCode());
		
		s1 = s1.concat(s2);
		
		//Hash code changes for s1 because a new memory location is created after value change
		System.out.println("After concat: " + "\n" + "s1:" + s1.hashCode() + "\n" + "s2:" + s2.hashCode());
	}

}
