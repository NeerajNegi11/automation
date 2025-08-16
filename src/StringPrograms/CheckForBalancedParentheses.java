package StringPrograms;

public class CheckForBalancedParentheses {

	public static void main(String[] args) {
	
	String str = "())(()";
	
	
    int balance = 0;
    boolean isBalanced = true;
    
    for (char ch : str.toCharArray())
    {
    	if ( ch == '(')
    	{
    		balance ++;
    	}
    	else if ( ch == ')')
    	{
    		balance --;
    	}
    	if (balance <0)
    	{	
    		isBalanced = false;	
    		break;
    	}
        System.out.println(balance);
    }
    if (isBalanced && balance == 0)
	    {
	    System.out.println("Balanced");	
	    }
    else 
        {
    	System.out.println("Not balanced");	
        }
	}
}
