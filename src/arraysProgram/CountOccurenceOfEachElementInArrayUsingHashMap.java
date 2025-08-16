package arraysProgram;

import java.util.HashMap;
import java.util.Map;

    public class CountOccurenceOfEachElementInArrayUsingHashMap {
    
	public static void main(String[] args) {
	
	int arr[] = {34, 65, 34, 12, 75, 33,12 };
	
	HashMap <Integer, Integer> countmap =  new HashMap <Integer, Integer> ();
	
	for (int num: arr) {
	countmap.put(num, countmap.getOrDefault(num, 0)+1);
	}
	
	for (Map.Entry<Integer, Integer> map : countmap.entrySet())
	{
		System.out.println(map.getKey() + " " +  map.getValue());
	}
	
	}
}
