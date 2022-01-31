package o.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {
	
	public static void main(String[] args) {
		
		//Four tasks created
		CheckProcessorTask[] cps = {new CheckProcessorTask("ATM"), 
								    new CheckProcessorTask("Bank"),
								    new CheckProcessorTask("Mobile"),
								    new CheckProcessorTask("Web")};
		
		//Two threads are created to manages these four tasks
		ExecutorService service = Executors.newFixedThreadPool(2); 
		
		for (CheckProcessorTask checkProcessorTask : cps) {
			service.submit(checkProcessorTask);
		}
		
		service.shutdown();
	
	}

}
