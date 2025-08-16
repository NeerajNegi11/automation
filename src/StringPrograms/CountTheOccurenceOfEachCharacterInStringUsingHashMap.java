package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountTheOccurenceOfEachCharacterInStringUsingHashMap {

	public static void main(String[] args) {
		String s = "Hellohew World Program";
		s= s.toLowerCase().trim().replaceAll("\\s+", "");
		char ch [] = s.toCharArray();
		HashMap <Character, Integer> map = new HashMap <Character, Integer>();
		
		for (char c : ch )
		{
		map.put(c, map.getOrDefault(c, 0) +1);
		}
        for (Map.Entry<Character, Integer> entry: map.entrySet() )
        {
        System.out.println(entry.getKey() + ": " + entry.getValue());	
        }
		
	}

}
