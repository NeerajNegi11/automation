package StringPrograms;

import java.util.HashMap;

public class FindDuplicateWordInStringUsingHashMap2 {

	public static void main(String[] args) {

		String str = " hello world program java hello world";
		str = str.toLowerCase().trim().replaceAll("\\s+", " ");
		String [] splitword = str.split(" ");
		
		HashMap <String, Integer> map = new HashMap <String, Integer> ();
		boolean duplicatefound = false;
		for (String word : splitword)
		{
		  if (map.containsKey(word)) 
		  {
		  System.out.println(word);	 
		  duplicatefound = true;
		  }
			
		  map.put(word, map.getOrDefault(word, 0) +1 );
		}
		if (!duplicatefound) 
		{
		System.out.println("No duplicate found");	
		}
}
}
