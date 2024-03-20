package collection_demo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
//		HashSet lhs = new HashSet(); // no duplicates and no insertion order is preserved

		LinkedHashSet lhs = new LinkedHashSet(); // // no duplicates but insertion order is preserved
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		lhs.add(600);
		
		System.out.println(lhs);
		

	}

}
