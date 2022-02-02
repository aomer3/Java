package r.strings;

public class TestReferences {
	
	public static void main(String[] args) {
		
		User user = new User("John");
		System.out.println(user); //By default, objects display the object reference
		
		String s = new String("John");
		System.out.println(s); //By default, Strings display the value
		
		Integer i = 10;
		System.out.println(i); //By default, Wrapper types display the value
		
		//String value and Object variable value point to same memory location because
		//the value is the same
		System.out.println(s.hashCode() == user.name.hashCode());
	}

}
