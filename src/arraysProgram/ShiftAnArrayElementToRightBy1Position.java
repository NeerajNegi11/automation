package arraysProgram;

import java.util.Arrays;

public class ShiftAnArrayElementToRightBy1Position {

	public static void main(String[] args) {
	Integer arr[] = {34, 65, 34, 12, 75, 33,12 };
	int lastElement = arr[arr.length-1];
	// Shift array to 1 position right
	// {12, 34, 65, 34, 12, 75, 33}
	for ( int i=arr.length-1; i>0 ; i--)
	{
	arr[i] = arr [i-1];	
	
	}
	  arr[0] = lastElement;
   // for (int t : arr)
    	System.out.print("Shift array to right " + Arrays.toString(arr));
    	System.out.println();
    
    
    int arr1[] = {34, 65, 34, 12, 75, 33,12 };
    int firstElement = arr1[0];
    // Shift array to 1 position left 
    // { 65,34,12,75,33, 12, 34}
    
    for (int i =0; i<arr.length-1 ; i++)
    {
    	arr1[i] = arr1[i+1];
    }
    arr1[arr.length-1] = firstElement;
    
   // for ( int z : arr1)
    System.out.print("Shift array to left " + Arrays.toString(arr1));
	}
}
