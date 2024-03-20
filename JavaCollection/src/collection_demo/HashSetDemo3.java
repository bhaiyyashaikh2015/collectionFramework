package collection_demo;

import java.util.HashSet;

// Special methods of Set
public class HashSetDemo3 {

	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("HashSet 1 :: " +set1);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		System.out.println("HashSet 2 :: " +set2);
		
		// UNION--> add set1 and set2 and removes duplicates
//		set1.addAll(set2);
//		System.out.println("UNIOIN = " +set1);
		
		// INTERSECTION--> common element from set1 and set2
//		set1.retainAll(set2);
//		System.out.println("INTERSECTION = " +set1);
		
		// DIFFERENCE --> remove set2 from set1 element
//		set1.removeAll(set2);
//		System.out.println("DIFFERENCE = " +set1);
		
		// SUBSET --> to check all set2 elements are present in set1 or not
		System.out.println(set1.containsAll(set2));
		

	}

}
