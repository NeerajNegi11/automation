package arraysProgram;

import java.util.Arrays;

public class CountOccurenceOfEachElementInArrayUsingSort {

	public static void main(String[] args) {
		
	int arr[] = {10, 89,36,89,36, 10, 9, 89};
	// 10, 10, 36, 36, 89, 89, 90
	Arrays.sort(arr);
	int count = 1;
	for (int i= 1; i< arr.length; i++)
	{

	if (arr[i] == arr[i-1]) 
	{
		count++;
	}
	else {
	System.out.println(arr[i-1] + " " + count);	
	count =1;                       
	}
	}
	 // Print the count for the last element
    System.out.println(arr[arr.length - 1] + " " + count);
	}

}
