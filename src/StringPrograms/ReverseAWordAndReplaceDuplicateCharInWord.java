package StringPrograms;

import java.util.HashMap;
import java.util.HashSet;

public class ReverseAWordAndReplaceDuplicateCharInWord {

	public static void main(String[] args) {
	
	String str = "  hellol  Program  ";
	
	str = str.trim().toLowerCase().replaceAll("\\s+", " ");
	//System.out.println(str);
	String words [] = str.split(" "); 
	//char ch [] = new char[str.length()]; 
	
	String result = "";
	
    for ( String word : words)
    {
         String reverse = "";
         //char ch [] = new char [word.length()];
       
         // Reverse the word manually using for loop
	     for (int i = word.length()-1 ;  i>=0 ; i--)          
          { 
         // ch[i] = word.charAt(word.length()-i-1);
		   reverse += word.charAt(i);
          }
	    
           //String reverse = new String(ch);
          //System.out.print( reverse + " " );
         //System.out.println();
         //String rev = String.valueOf(ch);
          //System.out.print(rev + " ");
       
          // Count the character in each word
          HashMap <Character, Integer> map = new HashMap <Character, Integer>();
          for (char c : reverse.toCharArray()) 
          {
          map.put(c, map.getOrDefault(c, 0)+1);
          }
       
         // Build final word replacing duplicate character with '$'
         String finalword = "";
         HashSet <Character> set = new HashSet <Character> ();        
         for (char ch : reverse.toCharArray())
         {
             if (set.contains(ch))
             {
             finalword += "$";	 
             }
             else {
             finalword += ch;
             set.add(ch);
             }     
         }
         result += finalword + " ";   
    }
    System.out.println(result + " ");
    
	}
}