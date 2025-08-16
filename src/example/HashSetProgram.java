package example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {

	public static void main(String[] args) {
    
	HashSet<Comparable> arr = new HashSet<Comparable> ();
	// Set sample = new HashSet();
	// HashSet <Integer> sample1 = new HashSet <Integer>();
	arr.add(20);
	arr.add("amit");
	arr.add(null);
	arr.add(null);
	arr.add("sumit");
	
	System.out.println(arr);
	System.out.println(arr.isEmpty());
	System.out.println(arr.size());
	
	// Converting HashSet into ArrayList
	ArrayList arr1 = new ArrayList (arr);
	System.out.println(arr1);
	System.out.println(arr1.get(0));
	
	// using Iterator
	Iterator  itr =  arr.iterator();
	
	while( itr.hasNext())
	{
		System.out.println(itr.next() );
	}
	}

}
