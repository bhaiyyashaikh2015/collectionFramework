package collection_demo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		
//		Hashtable t = new Hashtable(); // default capacity=11 and load factor=0.75
//		Hashtable t = new Hashtable(capacity, load_factor); (22, 0.90f)
		
		Hashtable<Integer, String> t = new Hashtable<Integer, String>();
		
		t.put(101, "Bhaiyya");
		t.put(102, "Samir");
		t.put(103, "Jakir");
		t.put(104, "Bhaiyya"); // duplicate values are allowed
		t.put(101, "Shaikh"); // replaced old value with new value for key 101
		
		// NULL not allowed as key/value
		
		System.out.println(t); // {104=Bhaiyya, 103=Jakir, 102=Samir, 101=Shaikh}
		
		// get value
		System.out.println(t.get(101)); // Shaikh
		
		// remove an entry
		t.remove(104);
		System.out.println(t); // {103=Jakir, 102=Samir, 101=Shaikh}
		
		System.out.println(t.containsKey(102)); // true
		System.out.println(t.containsKey(105)); // false
		
		System.out.println(t.containsValue("Samir")); // true
		System.out.println(t.containsValue("Y")); // false
		
		System.out.println(t.isEmpty()); // false
		
		System.out.println(t.keySet()); // [103, 102, 101]
		System.out.println(t.values()); // [Jakir, Samir, Shaikh]
		
		// read kay and value using for..each loop
		for(int i : t.keySet())
		{
			System.out.println(i +"     " + t.get(i));
		}
		
		// Entry specific methods
		for(Map.Entry entry : t.entrySet())
		{
			System.out.println(entry.getKey() + "     ===    " + entry.getValue());
		}

		// iterator()
		Set s = t.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "     <===>    " + entry.getValue());
			
		}
	}

}
