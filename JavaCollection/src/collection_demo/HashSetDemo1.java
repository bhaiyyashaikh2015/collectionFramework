package collection_demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet(); // Default capacity=16 load_factor=0.75
//		HashSet hs = new HashSet(100); // capacity=100 load_factor=0.75
//		HashSet hs = new HashSet(100,(float) 0.90); // capacity=100 load_factor=0.90
//		HashSet<Integer> hs = new HashSet<Integer>(); // for homogeneous data capacity=16 load_factor=0.75
		
		hs.add(100);
		hs.add("welcome");
		hs.add(10.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		hs.add("bhaiyya");
		
		System.out.println(hs); // [null, bhaiyya, A, 100, 10.5, welcome, true] --> Insertion order is not preserved
		
		// remove
		hs.remove("bhaiyya");
		System.out.println("After removing :: " +hs); // [null, A, 100, 10.5, welcome, true]
		
		// we don't have get() and set() for HashSet
		
		System.out.println(hs.contains("bhaiyya")); // false
		System.out.println(hs.contains("welcome")); // true
		System.out.println(hs.isEmpty()); // false
		
		// for loop is not applicable, because index concept not available in HASHSET
		
		// reading data using for..each loop
		for(Object e : hs)
		{
			System.out.println("---Using for..each---" +e);
		}
		
		// reading data using iterator()
		Iterator it  = hs.iterator();
		while(it.hasNext())
		{
			System.out.println("===Using iterator===" +it.next());
		}
		
		

	}

}
