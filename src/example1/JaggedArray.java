package example1;

public class JaggedArray {

	public static void main(String[] args) {
		
	int r= 5;
	// Declared 2D array with 5 rows arr[0]= null, arr[1] = null, ...
	int arr[] [] = new int [r][];
	//Now intialize each row.. now arr[0] = new int [1], arr[1] = new int [2] ..  
	for (int i = 0 ; i< arr.length; i++)
	arr[i] = new int [i+1];
	/* arr[0] = [0]           
	 * arr[1] = [0,0]     
	 * arr[2] = [0,0,0]   
	 * arr[3] = [0,0,0,0] 
	 */
	// Now print this pattern
	for (int i=0 ; i<arr.length; i++) 
	{
	for (int j=0 ; j < arr[i].length; j++)	
	{
	System.out.print(arr[i][j] + " ");	
	}
	System.out.println();
	}
	
	   
	}
}
