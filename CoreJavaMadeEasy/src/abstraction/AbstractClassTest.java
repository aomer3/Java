package j.abstraction;

public class AbstractClassTest {
	
	public static void main(String[] args) {
		
		//Cannot instantiate an abstract class (irrespective of it having abstract methods 
		//or not.
		AbstractClass ac = new AbstractClassChild(); //abstract class with abstract methods
		
		//AbstractClassNAM acnam = new AbstractClassNAM(); //abstract class without abstract methods
	}

}
