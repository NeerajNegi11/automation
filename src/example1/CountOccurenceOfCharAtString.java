package example1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountOccurenceOfCharAtString {
	
	 static void count (String str) {
		HashMap <Character, Integer> obj = new HashMap <>();
		String str1 = str.toLowerCase().replaceAll("\\s+", "");
		char ch [] = str1.toCharArray();
		for (char c : ch) 
		{
			//if(obj.containsKey(c)) {
				obj.put(c, obj.getOrDefault(c,0) +1);
			
			}
			//else {
			//	obj.put(c, 1);
			//}
		
		
		// convert to list and sort by key (character)
		 List <Character>  keys = new ArrayList <> (obj.keySet());
		 Collections.sort(keys);
		 
		 for (char ch1: keys) {
			 System.out.println(ch1 + " count is " + obj.get(ch1));
		 }
		 System.out.println(obj);
	 }

		//System.out.println(obj);	}
	public static void main(String[] args) {
		//CountOccurenceOfCharAtString ass = new CountOccurenceOfCharAtString();
		
		
		String str = "Helllo World program";
		count(str);
		
	}
}
