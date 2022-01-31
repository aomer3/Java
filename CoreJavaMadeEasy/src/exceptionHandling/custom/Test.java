package m.exceptionHandling.custom;

public class Test {
	
	public static void main(String[] args) {
		
		//custom checked exception
		try {
		throw new CheckedCustomException("Business exception that needs to be handled.");
		}
		catch(CheckedCustomException e){
			
		}
		
		//custom unchecked exception
		throw new UncheckedCustomException("Business exception occured");
	}

}
