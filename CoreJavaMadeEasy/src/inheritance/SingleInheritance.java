package i.inheritance;

public class SingleInheritance {

	void m1() {
		System.out.println("Inside m1");
	}
	
	public static void main(String[] args) {
		
		SingleInheritance si = new SingleInheritance();
		
		//the one method we've created
		si.m1();
		
		//able to use many other methods we did not create, because all objects created
		//inherit from Object class which has those methods created in that class
		si.hashCode();
		si.getClass();
	}
}
