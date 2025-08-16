package arraysProgram;

import java.util.Arrays;

public class CheckIfAnArrayIsPalindrome {

	public static void main(String[] args) {
	
	int arr [] = {1,2,3,2,1,1};
	
	
	boolean ispalindrome = true;
	for (int i=0;  i<arr.length; i++) 
	{
	if (arr[i] != arr[arr.length -1-i]) 
	{
	ispalindrome = false;
	break;
	}
	}
	
	if (ispalindrome)
		System.out.println("Array is palindrome");
	else
	System.out.println("Array is not palindrome");
	
	}
}
