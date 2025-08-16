package example1;

import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int arr [] = {10, 20, 30, 50, 20, 30, 10, 40,45};
		Integer max = null;
	    Integer smax = null;
	    for (int i=1; i<arr.length; i++) 
	    {
	    	
	    if (max == null || arr[i] > max)
	    {
	    smax = max;
	    max = arr[i];
	    }
	    else if ((smax ==null || arr[i] > smax) && arr[i]!=max ) 
	    {
	    	smax = arr[i];
	    }
	    }
		System.out.println(smax);
	}
}
