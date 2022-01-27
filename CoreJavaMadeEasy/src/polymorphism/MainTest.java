package k.polymorphism;

public class MainTest {
	
	//Overloaded main method 
	//JVM will run the main method with signature String[] args when the program starts
	public static void main(String[] args) {
		
		System.out.println("Default main method");
	}
	
	public static void main(int args) {
		System.out.println("Overloaded main method");
	}

}
