package StarPatternProgram;

public class DiamondPattern {

	public static void main(String[] args) {
	/*	    *
		   * *
		  * * *
		 * * * *
		* * * * *
		 * * * *
		  * * *
		   * *
		    *
	*/
	int rows =5;
	for (int i=0; i<=rows; i++ )
	{
		for (int j=0; j<=rows-i; j++)
		{
			System.out.print(" ");
		}
		for(int k =0 ; k<=i ; k++)
		{
		    System.out.print("* ");	
		}
		System.out.println();
	}
	for (int l=0 ; l<=rows-1; l++)
	{
		for (int m =0; m<=l ; m++)
		{
			System.out.print(" ");
		}
		for (int n=rows-1; n>=l ; n--)
		{
			System.out.print(" *");
		}
	    System.out.println();	
	}
	
	}
}
