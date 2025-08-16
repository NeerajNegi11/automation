package StringPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatches {

	public static void main(String[] args) {
		String s = "Geeks in java";
	
		// Creating a pattern
		Pattern p = Pattern.compile(s, Pattern.CASE_INSENSITIVE);
		
		
		// Creating a matcher for the input
		Matcher m = p.matcher("Geeks in Java String");
		System.out.println(Pattern.matches("java", "java"));
		Boolean b = m.matches();
		if(m.find())
		{
		System.out.println("Match found");
		}
		else
		{
		System.out.println("Match not found");
		} 
		if (b)
		{
		System.out.println("Match found");
		}
		else
		{
		System.out.println("Match not found");
		}
		
	}
}
