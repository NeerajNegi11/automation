package example;

import java.util.ArrayList;
//import java.util.List;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
    ArrayList<Comparable> arr = new ArrayList<Comparable> (); 
    //List list1 = new ArrayList();
    //ArrayList <Integer> mylist = new ArrayList <Integer> ();
    
    // Indexing is maintained in case of ArrayList
    arr.add(10);
    arr.add("Sumit");
    arr.add(458.56);
    arr.add(true);
    
    // Add object according to index
    arr.add(0, "Hello");
    
    // ArrayList can hold null and duplicate value 
    arr.add(null);
    arr.add(null);
    arr.add("punjab");

    
    // Get index value
    //System.out.println(arr.get(3));
    
    // will clone arr object
    //arr.clone();
    
    // will print array size
    System.out.println("Print array size " + arr.size());
    
    // clear ArrayList object
    // arr.clear();
    System.out.println("Value are cleared");
    
    System.out.println(arr.contains("punjab"));
    // Print the value in arrlist
    System.out.println(arr);
    //arr.remove(6);
    System.out.println(arr);
   
    // set method is used to set particular index value
    arr.set(5, 90);
    System.out.println(arr);
    
    // Retrieve all value using for loop
    for (int s= 0; s < arr.size(); s++) {
    	System.out.println(arr.get(s));
    }
    
    // Retrieve all object using enhanced for loop
    for (Object obj : arr) 
    {
    System.out.println(obj);
    }
    
    // Using iterator - java collections
    Iterator it  = arr.iterator();
    while (it.hasNext()) {
    	System.out.println("print " + it.next());
    }
    
    // Removing elements
    ArrayList list2 =  new ArrayList ();
    list2.add(90);
    list2.add(null);
    arr.removeAll(list2);
    System.out.println(arr);
    
    
	}
}
