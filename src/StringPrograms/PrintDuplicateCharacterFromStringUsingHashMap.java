package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacterFromStringUsingHashMap {

	public static void main(String[] args) {
	
	String str = "hello world";
	str =  str.trim().toLowerCase().replaceAll("\\s+", "");
	char [] ch = str.toCharArray();
	HashMap <Character, Integer> map = new HashMap <Character, Integer> ();
	
	for ( Character c : ch)
	{
	map.put(c, map.getOrDefault(c, 0) + 1);	
	}
	
	for ( Map.Entry<Character, Integer> entry : map.entrySet() )
	{
	if (entry.getValue() >1)
	{
	System.out.println(entry.getKey() + " " + entry.getValue());
	}
	}
	}
}
