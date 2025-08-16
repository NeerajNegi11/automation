package example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayListValueInAscDesc {

	public static void main(String[] args) {

	Integer num [] = {20,5, 10, 50};
	ArrayList <Integer> obj = new ArrayList <Integer> ();

	
	//Collections.sort(obj);
	
	for (Integer  x : num) {
		obj.add(x);
	}
	
	//Sorting done through Collections in Ascending order
	Collections.sort(obj);
	System.out.println(obj);
	System.out.println(obj.size());
	
    // Sorting in Descending order
	//Collections.reverse(obj);
	//System.out.println(obj);
	Collections.sort(obj, Collections.reverseOrder());
	System.out.println(obj);
	
	
	}
}
