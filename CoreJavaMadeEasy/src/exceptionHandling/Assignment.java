package m.exceptionHandling;

public class Assignment {
		
	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			throw new MyThreadException("Thread exception has occured");
		}
		
	}

}
