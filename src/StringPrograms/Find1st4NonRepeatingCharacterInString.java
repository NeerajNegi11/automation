package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class Find1st4NonRepeatingCharacterInString {
    
	public static void main(String[] args) {
	
	String str = "  Geeks  for geeks";
	str = str.trim().toLowerCase().replaceAll("\\s+", "");
	char ch[] = str.toCharArray();
	str = str.trim().toLowerCase().replaceAll("//s+", "");
	
	HashMap <Character, Integer> map = new HashMap <Character, Integer>();
	
	for ( char c : ch)
	{
		map.put(c, map.getOrDefault(c, 0) + 1);
	}
	for (Map.Entry<Character, Integer> entry : map.entrySet()  )
	{
		System.out.println(entry.getKey() + " " + entry.getValue());
	}
	int count =0;
	for (char c : ch)
	{
		if (map.get(c) ==1)
		{
			System.out.print(c + " ");
			count++;
		}
		if (count == 4) 
		{
			break;
		}
	}
	
	}
}
