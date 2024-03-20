package collection_demo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("x");
		l.add("y");
		l.add("z");
		l.add("a");
		l.add("b");
		l.add("c");
		
		LinkedList l2 = new LinkedList();
		
		l2.addAll(l);
		System.out.println(l2); // [x, y, z, a, b, c]
		
		l2.removeAll(l);
		System.out.println(l2); // []
		
		// sorting --> sorting possible only if we have homogeneous data in LL
		System.out.println("Before sorting " +l); // [x, y, z, a, b, c]
		Collections.sort(l);
		System.out.println("After sorting " +l);  // [a, b, c, x, y, z]
		
		// reverse sorting
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("After reverse sorting " +l);  // [z, y, x, c, b, a]
		
		// shuffling
		Collections.shuffle(l);
		System.out.println("After shuffling " +l);  // x, z, c, b, a, y]

	}

}
