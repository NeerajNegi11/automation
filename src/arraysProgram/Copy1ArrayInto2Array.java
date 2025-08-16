package arraysProgram;

import java.util.Arrays;

public class Copy1ArrayInto2Array {

	public static void main(String[] args) {
	int arr[] = {34, 65, 34, 12, 75, 33,12 };
	int arr1[] = new int [arr.length];
	
	for (int i=0; i<arr.length; i++)
	{
		arr1[i] = arr[i];
	}
	System.out.print(Arrays.toString(arr1));
	System.out.println();
    for (int copy :  arr1)
    System.out.print(copy + " " );	
	}
}
