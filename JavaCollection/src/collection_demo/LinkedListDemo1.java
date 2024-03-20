package collection_demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		// Declare a homogeneous LinkedList
		// LinkedList<Integer> l = new LinkedList<Integer>();
		// LinkedList<String> l = new LinkedList<String>();
		
		// Declare a heterogeneous LinkedList
		LinkedList l = new LinkedList();
		
		// add elements to linked list
		l.add(100);
		l.add("bhaiyya");
		l.add('c');
		l.add(5.5);
		l.add(null);
		l.add(true); 
		
		System.out.println(l); // [100, bhaiyya, c, 5.5, null, true]
		System.out.println(l.size()); // 6
		
		// remove
		l.remove(3); // index
//		l.remove();
//		l.remove(true);
		System.out.println("after removing : " +l); // [100, bhaiyya, c, null, true]
		
		// insert / add element in the middle of LinkedList
		l.add(3, "JAVA");
		System.out.println("after inserting : " +l); // [100, bhaiyya, c, JAVA, null, true]
		
		// retrieving value or object
		System.out.println(l.get(3)); // JAVA
		
		// change a value
		l.set(4, "Shaikh");
		System.out.println("after changing : " +l); // [100, bhaiyya, c, JAVA, Shaikh, true]
		
		// contains()
		System.out.println(l.contains("JAVA")); // true
		System.out.println(l.contains("PYTHON")); // false
		
		// isEmpty()
		System.out.println(l.isEmpty()); // false
		
		// Reading elements from LL using for loop
		for (int i=0; i<l.size(); i++)
		{
			System.out.println("================== USING for loop==============" +l.get(i));
		}
		
		// Reading elements from LL using for..each loop
		for (Object e : l)
		{
			System.out.println("================== USING for..each loop==============" +e);
		}
		
		// Reading elements from LL using iterator method
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			System.out.println("================== USING iterator() ==============" +it.next());
		}
		
	}

}
