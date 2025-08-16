package arraysProgram;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
	
	int arr [] = {10,20,30,40};
	int l = arr.length;
	int rev [] = new int [l];
	int rev1[] = new int [l];
	
	for (int i = arr.length-1, j=0; i>=0 ; i--, j++) 
	{
	rev[j] = arr[i];
	}
	// convert array into string
	System.out.println("Reversed array is " +  Arrays.toString(rev));
	
	for (int a : rev)
	{
	System.out.print(a + " ");
	}
	System.out.println();
	
	for (int i=0; i< arr.length-1; i++)
	{
		rev1[i] = arr[arr.length -1 -i];
	}
	System.out.println("Reversed array 2nd way " + Arrays.toString(rev1));
	
	}
}
