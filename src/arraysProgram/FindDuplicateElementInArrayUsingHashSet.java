package arraysProgram;

import java.util.HashSet;

public class FindDuplicateElementInArrayUsingHashSet {

	public static void main(String[] args) {

		int arr[] = {34, 34,65, 34, 34, 12, 75, 33,12 }; 
		
		HashSet <Integer> set = new HashSet <Integer> ();
		HashSet <Integer> set1 = new HashSet <Integer> ();
		
		for (int num : arr) 
		{
		if(!set.add(num))
		{
			set1.add(num);
		}
		}
		for (int a : set1) 
		{
			System.out.println(a);
		}
		
	}

}
