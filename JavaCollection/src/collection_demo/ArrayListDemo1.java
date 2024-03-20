package collection_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		// Declare ArrayList
		ArrayList al = new ArrayList();
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		ArrayList<String> al = new ArrayList<String>();
//		List al = new ArrayList();
		
		// Add new elements to the ArrayList
		al.add(100);
		al.add("bhaiyya");
		al.add(5.5);
		al.add('c');
		al.add(true);
		
		System.out.println(al); // [100, bhaiyya, 5.5, c, true]
		
		// to check how many objects are stored in ArrayList
		
		System.out.println("Number of elements in al is " +al.size()); // 5
		
		// remove
		al.remove(0); // here 0 is the index
		al.remove("bhaiyya");
		System.out.println("After removing element from ArrayList is : " +al); // [5.5, c, true]
		
		// insert a new element
		al.add(0, 100);
		al.add(1, "bhaiyya");
		System.out.println("After adding element to ArrayList is : " +al); // [100, bhaiyya, 5.5, c, true]
		
		// retrieve specific element/object from list
		System.out.println(al.get(1)); // bhaiyya
		
		// Change element / replace element
		al.set(0, 111);
		System.out.println("After changing element to ArrayList is : " +al); // [111, bhaiyya, 5.5, c, true]
		
		// search --> contains()--> returns true/false
		System.out.println(al.contains(111)); // true
		System.out.println(al.contains(100)); // false
		
		// isEmpty()-->true / false
		System.out.println(al.isEmpty()); // false
		
		// 1) Read the data using for loop
		System.out.println("Read the data using for loop...........");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		// 2) Read the data using for..each loop
		System.out.println("Read the data using for..each loop................");
		for(Object element : al) {
			System.out.println(element);
		}
		
		// 3) Read the data using iterator()
		System.out.println("Read the data using iterator method..............");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
