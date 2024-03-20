package collection_demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al);

		ArrayList al2 = new ArrayList();
		al2.addAll(al);
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println(al2);
		
		// Sort
		Collections.sort(al);
		System.out.println("Sorted : " +al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Sorted reverse : " +al);
		
		// shuffling
		Collections.shuffle(al);
		System.out.println("After shuffling : " +al);
	}

}
