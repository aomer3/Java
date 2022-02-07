package y.notes.classloading;

//This test proves that even though we can create multiple objects of a class, the class
//itself is only loaded once into memory
public class MultipleObjects {

	public static void main(String[] args) {
		
		User u1 = new User();
		Class c1 = u1.getClass();
		
		User u2 = new User();
		Class c2 = u2.getClass();
		
		
		//No matter how many objects we create of a class, the class is loaded into memory
		//once and then used to create objects as needed 
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);
		
		//Getting the classloader that loads this class
		System.out.println(c1.getClassLoader());
		
		//Predefined classes like String are loaded by the bootstrap loader, not an application loader
		System.out.println(String.class.getClassLoader());
	}
}
