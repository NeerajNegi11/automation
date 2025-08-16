package arraysProgram;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortAscDesc {

	public static void main(String[] args) {
	Integer arr [] = {12,56,89,90,23};
	Integer arr1 [] = Arrays.copyOf(arr, arr.length);
	Arrays.sort(arr1, Collections.reverseOrder());
	
	Arrays.sort(arr);
	//int arr1 []= new int [arr.length];
	for (int z : arr)
	System.out.print(z + " ");
	System.out.println();
    System.out.println("Ascending array " + Arrays.toString(arr));
    
  
    
    System.out.println("Reverse order");
	for (int reverse :  arr1)
	System.out.print(reverse + " ");
	}
}

