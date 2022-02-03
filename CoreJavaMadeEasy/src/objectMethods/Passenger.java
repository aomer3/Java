package u.objectMethods;

public class Passenger {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Passenger Information\n" + 
	           "First Name: " + this.firstName + 
	           "\nLast Name: " + this.lastName;
	}
	
//	@Override
//	public int hashCode() {
//		return this.id + this.firstName.length() + this.lastName.length();
//	}
	
	@Override
	public boolean equals(Object obj) {
		Passenger passenger = (Passenger) obj;
		
		if((passenger.getId() == this.getId()) && 
		   (passenger.getFirstName().equals(this.getFirstName())) &&
		   (passenger.getLastName().equals(this.getLastName())) ){
			   return true;
		   }
		return false;
	}
	
}
