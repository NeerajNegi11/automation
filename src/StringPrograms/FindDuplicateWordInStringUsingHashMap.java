package StringPrograms;

import java.util.HashMap;

public class FindDuplicateWordInStringUsingHashMap {

	public static void main(String[] args) {
	
	String str = " hello world program java hello world";
    str = str.toLowerCase().trim().replaceAll("\\s+", " ");
    String [] splitword = str.split(" ");
    
    HashMap <String, Integer> map = new HashMap <String, Integer> ();
    
	for (String word : splitword)
	{
	map.put(word, map.getOrDefault(word, 0) +1 );
	}
	
	for (String word : map.keySet())
	{
		if(map.get(word) >1)
		{
	    System.out.println(word + ": " + map.get(word));
		}	
	}
	System.out.println("No Duplicate word found");		
	
}
}