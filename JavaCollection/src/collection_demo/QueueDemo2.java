package collection_demo;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueDemo2 {

	public static void main(String[] args) {
		
		LinkedList q = new LinkedList();
		
		// Adding elements add()	offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		q.offer(100); // heterogeneous data is allowed in LinkedList class
		
		System.out.println(q); // insertion order is preserved and duplicates are allowed [A, B, C, C, 100]
		
		// Get header element	element()	peek()
		System.out.println(q.element()); // A
		System.out.println(q.peek());    // A
		
		// Return and Remove element from the queue		remove()	poll()
		
		System.out.println(q.remove()); // A
		System.out.println(q); // [B, C, C, 100]
		
		System.out.println(q.poll()); // B
		System.out.println(q); // [C, C, 100]
		
		
		
		// To read all elements from the queue using iterator()
		System.out.println("========== iterator() ===============");
		Iterator it = q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	
	}

}
