package StringPrograms;

import java.util.HashSet;

public class CheckAllPalindromicSubstring {

	public static void main(String[] args) {
	
	String str = "aaba";
	str= str.trim().toLowerCase().replaceAll("\\s+", "");
    //char ch [] = str.toCharArray();
    int count = 0;
    HashSet<String> uniquePalindromes = new HashSet<String>();
    for (int i =0; i <str.length(); i++)
    {
    	for (int j =i+1 ; j <= str.length(); j++)
    	{
    	    String substring = str.substring(i, j);
    		if (Ispalindrome(substring))
    	    {	
			if (!uniquePalindromes.contains(substring)) 
			{
            System.out.println(substring + " is palindrome");
            uniquePalindromes.add(substring);
    		count ++;
    		}
    	    }
    	}
    }
    System.out.println("Total palindrome substring count is " + count );
	}
	
	  public static boolean Ispalindrome (String s) 
	    {
		 for (int i= 0; i< s.length(); i++)
		 {
		     if (s.charAt(i) != s.charAt(s.length()-i-1))
		     {
		    	return false; 
		     }
		 }	
		 return true;	
	    }
}
