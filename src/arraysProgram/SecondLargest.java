package arraysProgram;

public class SecondLargest {

	public static void main(String[] args) {
		//int arr[] = {34, 65, 34, 65, 12, 75, 33,12, 75,75 }; 
		int arr[] = {75, 75, 75, 65, 65, 35, 34, 12, 12 };
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		//int max = arr[0];
	    //int secondmax = 0;
		for (int i=0; i< arr.length ; i++) 
		{
			if (arr[i] > max) 
			{
				secondmax = max;
				max = arr[i];
			}
			else if (arr[i] > secondmax && arr[i]!=max) {
				secondmax =  arr[i];
			}
		}
		System.out.println(secondmax);
				
	}
}
