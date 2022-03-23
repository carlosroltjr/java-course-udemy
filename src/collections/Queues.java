package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		// Add and Offer -> add elements to the queue
		// Add and Offer work differently when the queue is full
		queue.add("Pieck"); // return false
		queue.add("Mikasa");
		queue.offer("Falco"); // throw exception
		queue.offer("Eren");
		
		// Peek and Element -> get next element from the queue without remove it
		// Peek and Element work differently when the queue is empty
		System.out.println(queue.peek()); // return null
		System.out.println(queue.peek());
		System.out.println(queue.element()); // throw exception
		System.out.println(queue.element());
		
		// Poll and Remove -> get next element from the queue and remove it
		// Poll and Remove work differently when the queue is empty
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.poll()); // when queue is empty return null
		System.out.println(queue.remove()); // throw exception
	}
}
