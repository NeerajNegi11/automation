package StringProgram;

import java.util.Arrays;

public class StringExample {

	public static void main(Stringpro[] args) {
		// TODO Auto-generated method stub
        Stringpro s = "Welcome";
        Stringpro s1 =new Stringpro ("Hello world");
        System.out.println(s);
        System.out.println(s1);
    
        // length() method - String class 
        int len = s1.length();
        System.out.println(len);
    		
        //concat() method - String class add multiple string
        Stringpro s3 = "India";
    
		Stringpro s2 = s +s1;
		System.out.println(s2);
		System.out.println(s1.concat(s));
		System.out.println(s1.concat(s1).concat(s3));
	    // trim() method - remove spaces from both side	
		
		Stringpro s4 = "  save world ";
		System.out.println(s4.length());
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.trim().length());
	
		// charAt() - return specified index in string		
		System.out.println(s3.charAt(2));
		
		// contains() method return true or false if value match in same case
		System.out.println(s4.contains("world"));
		
		// equals(), equalsIgnorecase(), contentEquals() - 
   // equals check exact text match, equalsIgnoreCase match exact text while ignoring uppercase, lowercase
		// contentEquals is similiar to equals
		
		Stringpro s5 = "world";
		Stringpro s6 = "World";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s5.contentEquals(s6));
		
		// substring() 
		System.out.println(s5.substring(1,2));
		
		// replace ()
		System.out.println(s5.replace('o', 'a'));
	    System.out.println(s5.replace("world", "india"));
	    
	    //uppercase , lowercase
	    System.out.println(s5.toUpperCase());
	    System.out.println(s6.toLowerCase());
	    
	    //split ()
	    Stringpro s7 = "Hello world";
	   Stringpro s8 [] =  s7.split(" ");
	   Stringpro s9 [] = s7.split("o");
	    System.out.println(Arrays.toString(s8));
	    System.out.println(s8[0]);
	    System.out.println(Arrays.toString(s9));
		
	}
}
