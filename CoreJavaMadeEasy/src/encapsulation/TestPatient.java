package l.encapsulation;

public class TestPatient {
	
	public static void main(String[] args) {
		
		Patient p = new Patient();
		p.setId(12345);
		p.setName("Ahmed");
		p.setSsn("123456789");
		
		System.out.println("ID: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("SSN: " + p.getSsn());
	}

}
