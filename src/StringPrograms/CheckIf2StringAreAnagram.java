package StringPrograms;

import java.util.Arrays;

public class CheckIf2StringAreAnagram {

	public static void main(String[] args) {
	String str = " Listeno ";
    String str1 = " osilent ";
    str = str.trim().toLowerCase();
    str1 = str1.trim().toLowerCase();
  
    char ch [] = str.toCharArray();
    char ch1 [] = str1.toCharArray();
    Arrays.sort(ch);
    Arrays.sort(ch1);
    
    String x = new String(ch);
   
    String y =  new String (ch1);
    
    System.out.print(x + " " + y );
    System.out.println();
    if (x.equals(y))
    {
    	System.out.println("Anagram string");
    }
    
    else 
    {
    System.out.println("Not anagram string");
    }
    
    
	}

}
