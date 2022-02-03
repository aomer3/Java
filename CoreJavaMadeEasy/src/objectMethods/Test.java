package u.objectMethods;

public class Test {
	
	public static void main(String[] args) {
		
		Passenger passenger = new Passenger();
		passenger.setId(123);
		passenger.setFirstName("Jack");
		passenger.setLastName("Smith");
		
		Passenger passenger2 = new Passenger();
		passenger2.setId(123);
		passenger2.setFirstName("Jack");
		passenger2.setLastName("Smith");
		
		Passenger passenger3 = new Passenger();
		passenger3.setId(456);
		passenger3.setFirstName("John");
		passenger3.setLastName("Doe");
		
		//overridden string method returns useful informtion about the object
		System.out.println(passenger);
		
		//overridden hashCode method return unique hash value (adding id and lengths of fields)
		System.out.println(passenger.hashCode());
		
		//overridden equals method returns true if two objects have same field values
		System.out.println(passenger.equals(passenger2));
		System.out.println(passenger.equals(passenger3));
		
	}

}
