package m.exceptionHandling.unchecked;

public class NullPointerExceptionHandling {
	
	static ArrayIndexOutOfBoundExceptionExample a;
		
	public static void main(String[] args) {
		
		try {
			//NullPointer Exception = trying to access methods of an object not yet created 
			NullPointerExceptionHandling.a.method();
		} catch(NullPointerException e) {
			System.out.println("Trying to reference an object not yet created.");
		}
		
	}
	

	
}
