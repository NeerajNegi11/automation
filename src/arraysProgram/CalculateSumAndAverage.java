package arraysProgram;

public class CalculateSumAndAverage {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4};
		int len = arr.length;
		int sum = 0;
		double average =0; 
		
		
		for (int i = 0; i< arr.length; i++)
		{
			sum += arr[i] ;
		}
		 average = (double) sum /len;
		System.out.println("Sum of Array " + sum);
		System.out.println("Average of Array " + average);
	}

}
