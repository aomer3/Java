package r.strings;

public class StringComparisons {
	
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "abc";
		
		// == checks if two objects point to same memory location
		System.out.println("Do s1 and s3 have same memory location? " + (s1 == s3));
		System.out.println("S1 memory location:" + s1.hashCode());
		System.out.println("S3 memory location:" + s3.hashCode());
		
		// equals() checks if two objects have the same value
		System.out.println("Do s1 and s3 have same value? " + s1.equals(s3));
		
		
		String s4 = new String("abc");
		
		//When you use new keyword to create a string, JVM automatically creates new memory
		//space and doesn't use string pooling even if values are the same
		//Don't use new keyword to create a String because it's bad for memory and performance
		System.out.println("Do s1 and s4 have same memory location? " + (s1 == s4));
		System.out.println("Do s1 and s4 have same value? " + (s1.equals(s4)));
		
		
		//Comparing String comparison to an Object comparison
		User user1 = new User("John");
		User user2 = new User("Jack");
		User user3 = new User("John");
		User user4 = user1;
		
		//When using the new keyword, objects will be always be stored in a new memory location
		System.out.println("Do user1 and user3 have same memory location? " + (user1 == user3));
		System.out.println("Do user1 and user3 have the same value? " + (user1.equals(user3)));
		
		//If an object is created using an object reference, they will have same memory location
		System.out.println("Do user1 and user4 have same memory location? " + (user1 == user4));
		System.out.println("Do user1 and user4 have the same value? " + (user1.equals(user4)));
		
		//Comparing using their instance variables is a better way to compare objects
		System.out.println("Do user1 and user3 have same memory location? " + (user1.name == user3.name));
		System.out.println("Do user1 and user3 have the same value? " + (user1.name.equals(user3.name)));
		
		
		
	}

}
