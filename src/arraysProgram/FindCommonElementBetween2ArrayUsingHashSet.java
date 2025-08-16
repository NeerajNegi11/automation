package arraysProgram;

import java.util.HashSet;

public class FindCommonElementBetween2ArrayUsingHashSet {

	public static void main(String[] args) {
		int arr[] = {34, 65, 34, 12, 75, 33, 12};
	    int arr1[] = {34, 67, 45, 33, 90, 90};
	    
	    HashSet <Integer> obj = new HashSet <Integer> ();
	    HashSet <Integer> obj1 =  new HashSet <Integer> ();
	    
	    for (int a : arr) {
	    	obj.add(a);
	    }
	    
	    for (int b : arr1) {
	    	if (obj.contains(b)) {
	    	obj1.add(b);
	    	}
	    }
	    
	    for (int c:  obj1)
	    	System.out.println(c);

	}

}
