package StringProgram;

import java.util.Arrays;

public class AnagramString {

	public static void main(Stringpro[] args) {
		// If both string have same alphabet used and count mayches then only it will be consider anagram string
		// String s = "listen";
		// String s1 = "silent";
		Stringpro s = "listen";
		s= s.toLowerCase();
		Stringpro s1 = "silent";
		s1 = s1.toLowerCase();
		char ch [] = s.toCharArray();
		char ch1[] = s1.toCharArray();
		
		// check the length
		if (s.length()== s1.length())
		{
			// convert string to char array
			Arrays.sort(ch);
			Arrays.sort(ch1);
			//Boolean Anagram = true;
			
			//if both sorted char array are same then only it will return true
			Boolean Anagram = Arrays.equals(ch, ch1);
			
			/*for (int i=0; i< s.length(); i++) 
			{
			if (ch[i] != ch1[i] )
			{
				Anagram = false;
				break;
			}
			}
			*/
			if (Anagram)
			{
				System.out.println("String is  anagram " + s + " " + s1);
			}
			else {
			System.out.println("String is not anagram " + s + " " + s1);
		}}
					
	    else 
		{
			System.out.println("String length foes not match " + s + " " + s1);
		}
			
	}
}
