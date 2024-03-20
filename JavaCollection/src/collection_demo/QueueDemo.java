package collection_demo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		
		// Adding elements add()	offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
//		q.offer(100); // heterogeneous data not allowed in PriorityQueue class
		
		System.out.println(q); // insertion order is preserved and duplicates are allowed [A, B, C, C]
		
		// Get header element	element()	peek()
		System.out.println(q.element()); // A
		System.out.println(q.peek());    // A
		
		// Return and Remove element from the queue		remove()	poll()
		
		System.out.println(q.remove()); // A
		System.out.println(q); // [B, C, C]
		
		System.out.println(q.poll()); // B
		System.out.println(q); // [C, C]
		
		PriorityQueue q2 = new PriorityQueue();
		
		// Adding elements add()	offer()
		q2.add("A2");
		q2.add("B2");
		q2.add("C2");
		q2.offer("D2");
		
		// To read all elements from the queue using iterator()
		System.out.println("========== iterator() ===============");
		Iterator it = q2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println();
		
		// To read all elements from the queue using for..each
		System.out.println("==========for each===============");
		for(Object ele : q2)
		{
			System.out.println(ele);
		}

	}

}
