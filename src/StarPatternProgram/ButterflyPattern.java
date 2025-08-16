package StarPatternProgram;

public class ButterflyPattern {

	public static void main(String[] args) {
	
	/*
			*       *
			**     **
			***   ***
			**** ****
			*********
			**** ****
			***   ***
			**     **
			*       *
	 */
	// Upper half Pattern
		int n=5;
		for (int i= 1; i <=n; i++)
		{
		   for (int j=1 ; j<=i ; j++)
		   {
			   System.out.print("*");
		   }
		   for (int j=1 ; j<=2*(n-i) ; j++)
		   {
			   System.out.print(" ");
		   }
		   for (int j=1 ; j<=i ; j++)
		   {
			   System.out.print("*");
		   }
		   
		System.out.println();		
		}
		 
     // Lower half pattern
		
		for (int i= 1; i <=4; i++)
		{
		   for (int j=4 ; j>=i ; j--)
		   {
			   System.out.print("*");
		   }
		   for (int j=1 ; j<=i ; j++)
		   {
			   System.out.print("  ");
		   }
		   
		   for (int j=1 ; j<=5-i ; j++)
		   {
			   System.out.print("*");
		   }
		   
		   
		System.out.println();		
		}
		
	}
}
