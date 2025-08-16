package StringProgram;

import java.util.Arrays;

//import java.lang.reflect.Array;

public class ReverseWordInString {

	public static void main(Stringpro[] args) {
		// TODO Auto-generated method stub
		// String s = "Hello world";
		// output s1 = "olleh dlrow";
		Stringpro s = "Hello world";
		Stringpro [] words = s.trim().split("\\s+");
		Stringpro result = "";
           
	    for (int i = 0; i < words.length; i++) 
	    {
	    	    Stringpro reverse = "";
	        	for (int j= words[i].length()-1; j>=0; j--)
	        	{
	        		reverse =  reverse + words[i].charAt(j);
	        	}
	             //System.out.print(reverse);
	        	result = result + reverse +  " "; 
	        }
	        System.out.println(result.trim());
	    }
		
	}


