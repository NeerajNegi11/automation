package packagenew;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {12, 13, 17, 16};
  int arr1 [] = new int [arr.length];
  int index=0;	
	for (int i=arr.length-1 ; i>=0; i--) 
	{
		arr1 [index]= arr [i]; 
		index++;
	}	
	for (int x=0; x<arr.length; x++) {
		System.out.print(arr1[x] + " ");
	}
	System.out.println();
	/// In built array method
	Arrays.sort(arr1);
	System.out.print(Arrays.toString(arr) + " ");
	System.out.println(" ");
	System.out.println(Arrays.toString(arr1)+ " ");
	}
}
