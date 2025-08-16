package arraysProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateElementInArrayUsingHaspMap {

	public static void main(String[] args) {
	int arr[] = {34, 34,65, 34, 34, 12, 75, 33,12 }; 
	
	HashMap <Integer, Integer> map =  new HashMap <Integer, Integer> ();
	
	for(Integer a : arr)
	{
	map.put(a, map.getOrDefault(a, 0) +1);
	}
	
	for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
	{
	if(entry.getValue() >1	)
	{
	System.out.println(entry.getKey() + " " + entry.getValue());	
	
	}
	}
	}
}
