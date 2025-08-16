package example1;

import java.util.HashSet;

public class PanagramStringHashSet {

	public static void main(String[] args) {
    
	String str = " The quick brown fox jumps over the lazy dog";
	String str1=  str.toLowerCase().trim().replaceAll("[^a-z]", "");

	char[] ch = str1.toCharArray();
	HashSet <Character > set = new HashSet<Character>();
	
	for (Character c : ch) 
	{
	if (c > 'a' && c <='z') {
	set.add(c);		
	}}
	if (set.size() ==26) 
	{
	System.out.println("Its a panagram string");	
	}
	else {
		System.out.println("Its not a panagram string");
	}
	System.out.println(set);
	}
}
