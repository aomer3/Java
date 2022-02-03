package v.collections.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<>();
		
		//peek() = retrieves the first element, returns null if empty
		//System.out.println("peek():" + queue.peek());
		//element() = retrieves first element, returns exception if empty
		//System.out.println("element(): " + queue.element());
		
		for(int i=20; i<30; i++) {
			queue.offer(i);
		}
		
		System.out.println("Original Queue: " + queue);
		
		//poll() = removes the first element, returns null if empty
		System.out.println("poll():" + queue.poll());
		System.out.println("After poll():" + queue);
		//remove() = removes the first element, return exception if empty
		System.out.println("remove():" + queue.remove());
		System.out.println("After remove():" + queue);
	}

}
