package example1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class CountOccurenceOfWordsAtString {
	
	public static void countword (String str) {
		HashMap <String, Integer> map = new HashMap <String, Integer> ();
 		str = str.toLowerCase().trim();
 		String words [] = str.split("\\s+");
 		for (String str1 : words) {
 			map.put(str1, map.getOrDefault(str1, 0)+1);
 		}
 		System.out.println(map);
 		
 		// Sort the words by order
 		ArrayList <String> sort1 = new ArrayList <>(map.keySet());
 		Collections.sort(sort1);
 		
 		// Print sort order
 		for (String s : sort1)
 		{
 			System.out.println(s + "count is " +  map.get(s));
 		}
 		
	}

	public static void main(String[] args) {
	
		String str = " Hello world program world";
		countword(str);
	
    
	}

}
