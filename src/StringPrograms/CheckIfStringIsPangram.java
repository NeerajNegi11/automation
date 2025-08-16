package StringPrograms;

import java.util.Arrays;

public class CheckIfStringIsPangram {

	public static void main(String[] args) {
		// quick brown fox jumps over the lazy dog
	String str= "The quick brown fox jumps over the lazy dog";
	str = str.trim().toLowerCase().replaceAll("\\s+" , "");
	char ch[] =  str.toCharArray(); 
    boolean [] present = new boolean[26];
    
    // loop through each character and mark as present in boolean
    for (int i=0; i < str.length(); i++)
    {
    	if (ch[i] >='a' && ch [i] <='z')
    	{
    		present [ch[i]-'a'] = true;
    	}
    }
    
    // check if boolean have all alphabet present
    boolean pangram = true;
    for (boolean b : present)
    {
    	// if b is false then set boolean false and break
    	if(!b)
    	{
    		pangram = false;
    		break;
    	}
    }
    
    if(pangram)
    {
    System.out.println("String is pangram");	
    }
    else
    {
    System.out.println("String is not pangram");
    }
			
	}
}
