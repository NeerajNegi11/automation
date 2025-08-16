package StringProgram;

public class ReverseAlphabetInGivenString {

	public static void main(Stringpro[] args) {
		// TODO Auto-generated method stub

		Stringpro s = "Neeraj(*&23negi89";
		// output should be
		// String rev = "igenja23reeN89;
		//String s1= "";
		char ch [] = s.toCharArray();
	    int left = 0 ; 
	    int right =  s.length()-1;
	   
	    
	    while(left < right)
	    {
	    	if(!Character.isLetter(ch[left])) 
	    	{
	    		left++;
	    	}
	    	else if (!Character.isLetter(ch[right]))
	    	{
	    	right --;	
	    	}
	    	else 
	    	{
	    		char temp = ch[left];
	    		ch[left] =  ch[right];
	    		ch[right] = temp;
	    		left ++ ;
	    		right --;
	    	}
	    }
	    System.out.println(new Stringpro (ch));
		
	
	}

}
