package arraysProgram;

import java.util.Arrays;

public class FindMissingNumberInRange {

	public static void main(String[] args) {

	int arr [] = {1,2,4,5};
	int n = 6;
    
	int arr1 [] = new int [n];
	for (int i=0; i< arr1.length; i++)
	{
	arr1[i] = i+1;
	}
	// arr1 [] = {1,2,3,4,5,6}
	for (int j=0 ; j<arr1.length;j++)
	{
	   boolean found = false;
	   // arr [] = {1,2,4,5} 
	   for(int k=0; k<arr.length; k++) 
	   {
	      if (arr1[j] == arr[k]) 
	      {
	      found = true;	
	      break;
	      }
	   }
	   if(!found) 
	   {
	   System.out.println(arr1[j]);
	   }
	}
	}
}
