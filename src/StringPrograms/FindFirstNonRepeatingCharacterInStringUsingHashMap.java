package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatingCharacterInStringUsingHashMap {

	public static void main(String[] args) {
		String str = "Hellohew World Program";
		str = str.trim().toLowerCase().replaceAll("\\s+", "");
		char ch [] = str.toCharArray();
	 HashMap <Character, Integer> map = new HashMap <Character, Integer> ();

	// Count character frequencies using HashMap
	for (char ch1 : ch) 
	{
	map.put(ch1, map.getOrDefault(ch1, 0) +1);	
	}
	
	// Find first character with count 1
	for (char ch1 : ch)
	{
		if (map.get(ch1)==1)
		{
			System.out.println("First repeating character found is : " + ch1);
			return;
		}
	}
	System.out.println("No First repeating character found");

	}

}
