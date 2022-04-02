package javaCollection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* The PriorityQueue class implements the Queue interface. 
 * It holds the elements or objects which are to be processed by their priorities. 
 * PriorityQueue doesn't allow null values to be stored in the queue. 
 * */

public class Queue_PriorityQueueClass {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();

		try {
			System.out.println("head:"+queue.element()); // this returns error if queue is empty
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		System.out.println("head:"+queue.peek());

		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");

		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());

		System.out.println("\nIterating the queue elements:");
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}  

		queue.remove();
		queue.poll();

		System.out.println("\nAfter removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

	}

}
