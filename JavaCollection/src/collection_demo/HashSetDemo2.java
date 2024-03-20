package collection_demo;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer> even_num = new HashSet<Integer>();
	
		even_num.add(2);
		even_num.add(4);
		even_num.add(6);		
		System.out.println(even_num); // [2, 4, 6]

		// addAll()
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.addAll(even_num);
		numbers.add(10);
		System.out.println(numbers); // [2, 4, 6, 10]
		
		// removeAll()
		numbers.removeAll(even_num);
		System.out.println(numbers); // [10]
	}

}
