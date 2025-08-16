package StringPrograms;

import java.util.HashSet;

public class FindDuplicateWordInStringUsingHashSet {

	public static void main(String[] args) {
	
	String str = " hello world program java hello world";
	str=  str.trim().toLowerCase().replaceAll("\\s+", " ");
	String [] words = str.split(" ");
	
	HashSet <String> set =  new HashSet <String> ();
	boolean isDuplicate = false;
	for (String word :words )
	{
	    if(set.contains(word))
	    {
	    System.out.println(word);
	    isDuplicate = true;
	    }
		set.add(word);	
	}
	if (!isDuplicate) 
	{
	System.out.println("No duplicte word found");	
	}
	
	}
}
