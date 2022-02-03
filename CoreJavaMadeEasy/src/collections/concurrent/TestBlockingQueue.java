package v.collections.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestBlockingQueue {
	
	public static void main(String[] args) {
		
		BlockingQueue<String> queue = new ArrayBlockingQueue(1024);
		OrderProducer orderProducer = new OrderProducer(queue);
		OrderConsumer orderConsumer = new OrderConsumer(queue);
		
		new Thread(orderProducer).start(); //produces work
		new Thread(orderConsumer).start(); //consumes work
		
		
	}

}
