package StarPatternProgram;

public class HollowRectangle {

	public static void main(String[] args) {
    /*
		* * * * *
		*       *
		*       *
		*       *
		* * * * *
     */
    int rows =5, cols =5;
	for (int i=0 ; i<=rows; i++ )
	{
		for (int j=0; j<=cols; j++ )
		{
			if(i==0 || i==rows || j==cols || j==0)
			{	
			System.out.print("* ");
			}
			else
			{
			System.out.print("  ");
			}
		}
		System.out.println();
	}	
	}
}
