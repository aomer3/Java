package m.exceptionHandling.checked;

public class UsingThrow {
	
	public static void main(String[] args) {
		
		//throw keyword with checked exception
		try {
		throw new Exception("");
		} 
		catch(Exception e) {
			
		}

		//throw keyword with unchecked exception
		throw new RuntimeException("Funds not available");
		
	}

}
