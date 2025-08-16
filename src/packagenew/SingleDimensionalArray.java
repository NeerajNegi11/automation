package packagenew;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [5];
		 a[0] = 11;
		 a[1] = 23;
		 a[2] = 33; 
		 a[3] = 44;
         a[4] = 55;
        int b [] =  {21, 43, 343, 67};
         
        
       // System.out.println(a.length);
       // System.out.println(b.length);
        for (int i=0; i<a.length; i++)
        {
        	System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        
        // Enhanced for loop
        for (int x : a)
        {
        	System.out.print(x + " ");
        }
        
	}

}
