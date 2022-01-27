package i.inheritance;

public class MultilevelTest {
	
	public static void main(String[] args) {
	
		Child c = new Child();
		c.f2();
		
		//Child class is able to use parent class's methods
		c.f1();
		
		//Child class is able to use Object class's methods
		c.hashCode();
		
		//Child class and parent class have same memory location
		
	}

}
