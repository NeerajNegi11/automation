package example1;

public class Conitnue {

	public static void main(String args[])
    {
        int c = 0;
      
        // While loop for iteration
        do 
        {          
          	// Continue used when c==3
          	if (c == 3) 
            {
                c++;
                continue;
            }

            System.out.print(c + " ");

            c++;
        }
        while (c<=5);
    }

}
