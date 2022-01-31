package m.exceptionHandling.custom;

public class UncheckedCustomException extends RuntimeException {
	
		UncheckedCustomException(String message){
			super(message);
		}
}
