package arraysProgram;

import java.util.Arrays;

public class RemoveDuplicateFromArrayUsingSort {

	public static void main(String[] args) {
	int arr[] = {34, 65, 34, 12, 75, 33,12 }; 
	Arrays.sort(arr);
	
	for (int i = 1; i <arr.length;i++)
		if (arr[i] != arr[i-1])
		{
			System.out.println(arr[i-1]);
		}
	}
}
