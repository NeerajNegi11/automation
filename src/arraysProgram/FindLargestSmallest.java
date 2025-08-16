package arraysProgram;

import java.util.Arrays;

public class FindLargestSmallest {

	public static void main(String[] args) {
	int n []= {10, 5, 90, 8, 100, 100, 1};
	int l = n.length;
	Arrays.sort(n);
	System.out.println("Smallest number is " + n[0]);
	System.out.println("Largest number is " + n[l-1]);
	
	
	int min= n[0] ;
	int max = n[0];
    
	for (int i=1 ; i< n.length ; i++) 
	{
		
			if (n[i] > max )
			{
			max = n[i]; 
			}
			else if(n[i] < min) {
				 min = n[i];
			}		
	}
	System.out.println("Largest number using loop " + max);
	System.out.println("Minimum number using loop " + min);

	}
}
