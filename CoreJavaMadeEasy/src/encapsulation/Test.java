package l.encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.setFirstName(null);
		c.setLastName("Omer");
		c.setCreditCard("12345");
		
		System.out.println("First Name: " + c.getFirstName());
		System.out.println("Last Name: " + c.getLastName());
		System.out.println("Credit Card: " + c.getCreditCard());
	}

}
