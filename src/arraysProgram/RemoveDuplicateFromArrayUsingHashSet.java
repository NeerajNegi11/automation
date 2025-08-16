package arraysProgram;

import java.util.HashSet;

public class RemoveDuplicateFromArrayUsingHashSet {

	public static void main(String[] args) {
		int arr[] = {34, 65, 34, 12, 75, 33,12 }; 	
		
	HashSet <Integer> set = new HashSet <>();
	for(Integer num : arr) 
	{
	set.add(num);
	}
	for (int num: set)
    System.out.print(num + " ");
	}
}
