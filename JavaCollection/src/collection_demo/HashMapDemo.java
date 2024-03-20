package collection_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<Integer, String>();
//		HashMap m = new HashMap();
		m.put(101, "Bhaiyya");
		m.put(102, "Jakir");
		m.put(103, "Samir");
		m.put(104, "Javed");
		m.put(105, "Niketan");
		m.put(106, "Bhaiyya"); // duplicate values are allowed
		m.put(105, "x"); // duplicate key are not allowed but if we do, then it will replace old value with new value
		
		System.out.println(m); // {101=Bhaiyya, 102=Jakir, 103=Samir, 104=Javed, 105=x, 106=Bhaiyya}
		
		// get value associated with key
		System.out.println(m.get(106)); // Bhaiyya
		
		m.remove(106); // remove pair from HashMap
		System.out.println(m); // {101=Bhaiyya, 102=Jakir, 103=Samir, 104=Javed, 105=x}
		
		// search for key
		System.out.println(m.containsKey(101)); // true
		System.out.println(m.containsKey(106)); // false
		
		// search for value
		System.out.println(m.containsValue("x"));		// true
		System.out.println(m.containsValue("Niketan")); // false
		
		System.out.println(m.isEmpty()); // false
		
		//size() 
		System.out.println(m.size()); // 5
		
		// get all the Keys--> returns all the keys as a Set collection
		System.out.println(m.keySet()); // [101, 102, 103, 104, 105]
		
		// Read keys one by one
		for(Object i : m.keySet())
		{
			System.out.println(i);
		}
		
		// get all the values--> returns all the values as a Collection
		System.out.println(m.values()); // Bhaiyya, Jakir, Samir, Javed, x]
		
		// Read values one by one
		for(Object i : m.values())
		{
			System.out.println(i);
		}
		
		// read values if you know keys as key-value
		for(Object i : m.keySet())
		{
			System.out.println(i + "   ===>   " + m.get(i));
		}
		
		// returns all the keys as a Set collection
		System.out.println(m.entrySet()); // [101=Bhaiyya, 102=Jakir, 103=Samir, 104=Javed, 105=x]
		
		// Read values one by one
		for(Object i : m.entrySet())
		{
			System.out.println(i);
		}
		
		// ********** Entry methods *************
		// To work with a specific entry
		for(Map.Entry entry : m.entrySet())
		{
			System.out.println(entry.getKey() + "   ===>   " + entry.getValue());
		}
		
		// Read keys and values using iterator() method
//		System.out.println("*********** Using iterator() ************");
//		Set s = m.entrySet();
//		Iterator itr = s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		// OR
		System.out.println("*********** Using iterator() ************");
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + " ============== " + entry.getValue());
		}

	}

}
