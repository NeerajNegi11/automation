package StringProgram;

public class PalindromeString {

	public static void main(Stringpro[] args) {
		// TODO Auto-generated method stub

		Stringpro s = "Level";
		s= s.toLowerCase();
	    Stringpro s1 = "";
	    boolean isPalindrome = true;
	    
	    //  1st approach
	    for (int i= s.length()-1; i>=0; i--)
	    {
	    	s1 = s1 + s.charAt(i);
	    }
		
	    if(s.equals(s1))
	    {
	    	System.out.println("The string is palindrome: " + s1);
	    }
	    else {
	    	System.out.println("The string is not palindrom:" + s1);
	    }
	    
	    // 2nd approach
	    
	    for (int j= 0 ; j< s.length()/2 ; j++)
	    {
	    	if (s.charAt(j) != s.charAt(s.length()-1 -j) ) {
	    		
	    		isPalindrome = false;
	    	break;
	    }
    	}
	    if (isPalindrome) 
	    {
	    System.out.println("The string is palindrome: " + s1);
	    }
	    else {
	    	System.out.println("The string is not palindrome: " + s1);
	    }
	    
	    // 3rd approach is using StringBuilder
	    
	    StringBuilder s4 = new StringBuilder(s);
	    s4.reverse().toString();
	    
	    if (s.equals(s4.toString()))
	    {
	    	System.out.println("String is palindrom: " + s4);
	    }
	    else {
	    	System.out.println("String is palindrom: " + s4 );
	    }
	    
	    // 4th approach is using StringBuffer
	    
	    Stringpro s5 = new StringBuffer(s).reverse().toString();
	    if (s.equals(s5))
	    {
	    	System.out.println("String is palindrom: " + s5);
	    }
	    else {
	    	System.out.println("String is palindrom: " + s5 );
	    }
	    
	}
}
