package collection_demo;

import java.util.LinkedList;

// Special methods for LinkedList --> These methods are mostly used to implement STACK and QUEUE
public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		
		System.out.println(l); // [dog, dog, cat, horse]
		
		l.addFirst("cow");
		System.out.println("After adding element at first :: " +l); // [cow, dog, dog, cat, horse]
		
		l.addLast("tiger");
		System.out.println("After adding element at last :: " +l); // [cow, dog, dog, cat, horse, tiger]
		
		System.out.println(l.getFirst()); // cow
		System.out.println(l.getLast()); // tiger
		
		l.removeFirst();
		System.out.println("After removing element at first :: " +l); // [dog, dog, cat, horse, tiger]
		
		l.removeLast();
		System.out.println("After removing element at first :: " +l); // [dog, dog, cat, horse]
		
		

	}

}
