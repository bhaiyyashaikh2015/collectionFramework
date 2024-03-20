package collection_demo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		String arr[] = {"Dog", "Cat", "Elephant"};
		System.out.println(arr);
		
		for(String val : arr)
		{
			System.out.println(val);
		}
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		

	}

}
