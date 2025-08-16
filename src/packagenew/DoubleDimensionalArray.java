package packagenew;

public class DoubleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a [] [] = new int [2] [2];
     a[0][0] = 11;
	 a[0] [1] = 12;	
	 a[1] [0] = 21;
	 a[1] [1] = 22;
	 
	 int b [] [] = { {1,2,3}, {4,5,6 } } ;
	 
	 // normal for loop
	 for (int i=0; i < b.length; i++ )
	 {
	 for (int j=0; j < b[i].length; j++)
	 {
		 System.out.print(b[i][j] + " ");
	 }
	 
	 System.out.println(" "); 
	 }
	 System.out.println(" ");
	 // Enhanced for loop
	 for (int x [] : a) 
	 {
		 for (int y: x) {
			 System.out.print(y + " ");
		 }
		 System.out.println(" ");
	 }
	}
}

