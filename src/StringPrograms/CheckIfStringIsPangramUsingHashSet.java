package StringPrograms;

import java.util.HashSet;

public class CheckIfStringIsPangramUsingHashSet {

	public static void main(String[] args) {
	
	String str = "The quick brown fox jumps over the lazy dog";
	str = str.trim().toLowerCase().replaceAll("\\s+", "");
	char [] ch =  str.toCharArray();
	HashSet <Character> set = new HashSet <Character> ();

	for (char c : ch)
	{
		set.add(c);
	}
	
	if (set.size()==26)
	{
		System.out.println("String is pangram");
	}
	else
	{
		System.out.println("String is not pangram");
	}
	
	}

}
