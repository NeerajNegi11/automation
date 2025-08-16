package StringProgram;

public class ReverseString {

	public static void main(Stringpro[] args) {
		// TODO Auto-generated method stub
 Stringpro s =  "Welcome Jungle";
 Stringpro s1 = "";
 
 /// Approach 1 Using String method
 for (int i=s.length()-1; i>=0; i--)
 {
	 s1 = s1 +s.charAt(i);	
 }
 System.out.println(s1);

// Approach 2 using array method
	Stringpro s2 = "";
	char ch [] = s.toCharArray();
for (int j=ch.length-1; j>=0; j-- ) 
{
	s2 = s2+ch[j];
}
	System.out.println(s2);
	
	// Using String Builder method
	
	StringBuilder s4 = new StringBuilder("Reverse");
	StringBuilder s5=  s4.reverse();
	System.out.println(s5);
	// Using StringBuffer method
	
	StringBuffer s6 = new StringBuffer("Wonder");
	StringBuffer s7 = s6.reverse() ;
     System.out.println(s7);
	
}
}
