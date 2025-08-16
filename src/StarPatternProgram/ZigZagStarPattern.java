package StarPatternProgram;

public class ZigZagStarPattern {

	public static void main(String[] args) {
 /*
			  *   *   *
			 * * * * * 
			*   *   *  
  */
	
	for (int i=0; i<=2 ; i++)
	{
	   for (int j=0; j<2-i; j++ )
	   {
		   System.out.print(" ");
	   }
	   for (int k=0 ; k<=2; k++)
	   {
		   if(i==1 ) 
		   {
			System.out.print("* ");   
		   }
		   else
		   {
		   System.out.print("*   ");
		   }
	   }
	  System.out.println();
	}
		
		
	}
}
