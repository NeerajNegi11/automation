package packagenew;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) 
	{
// TODO Auto-generated method stub
// In bubble sort we compare value with 1st index value other index value and swap the value accordingly
		int num1 [] = {10, 50, 9, 5, 33, 54};
		
		int temp = 0; 
		// loop through entire array index 
		for (int i=0; i<num1.length; i++)
		{
			// this loop compare index with other index value for comparison
			for (int j=i+1; j<num1.length; j++)
			{
				if (num1[j]< num1[i]) {
				temp = num1[i];
				num1[i] = num1[j];
				num1[j] = temp;
				
			}
		}
		}
System.out.println(Arrays.toString(num1));
	}
}
