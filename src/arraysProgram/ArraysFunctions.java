package arraysProgram;

import java.util.Arrays;

public class ArraysFunctions {

		public static void main(String[] args) {
		Integer arr[] = {34, 65, 34, 12, 75, 33,12 , 11};
		Integer arr5[] = {34, 65, 34, 12, 75, 33, 12, 11};
		System.out.println(Arrays.compare(arr, arr5));
	    System.out.println("Print as list " + Arrays.asList(arr5));
	    int findNumber =33;
	    
	    // Arrays.equals(arr,arr5) : compare the content
	    System.out.println("Compare the content return : " +  Arrays.equals(arr, arr5));
	   
	    // binarySearch(findNumber);
         int index = Arrays.binarySearch(arr,findNumber);
         if (index >=0)
         System.out.println("Number " +findNumber+ " is found at index " + index );
         else
         System.out.println("Number " +findNumber+ " is not found " + index);
         
         // Arrays.sort()
         Arrays.sort(arr);
         System.out.println("Sorted Arrays " + Arrays.toString(arr));
         
        
         for (int num: arr5)
         {
         int index6 = Arrays.binarySearch(arr, 0, 8, num);
         if (index6 >=0)
         System.out.println(num + " " + index6);
         }

         
         
         // String
         String[] str = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
         Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
        
         String [] key = {"alpha", "bravo"};
         for (String k : key) {
        // key.equalsIgnoreCase(key)
        // key.CASE_INSENSITIVE_ORDER
         // Search between index 1 to 4 (exclusive of 4)
         int index1 = Arrays.binarySearch(str, 0, 5, k, String.CASE_INSENSITIVE_ORDER);
         if (index1>=0)
         System.out.println("Found " + k + " at position : " + index1);
         else
         System.out.println("Key not Found " + k );
         }
         
         // compare () works with array only 
         System.out.println(Arrays.compare(arr, arr5));
         
         int arr9[] = new int [5];
         Arrays.setAll(arr9, i-> i+1);
         System.out.println(Arrays.toString(arr9));
         
         int arr10[] = new int [4];
         for (int i= 0 ;  i<arr10.length ; i++)
         arr10[i] = i;
         System.out.println(Arrays.toString(arr10));
         
	}

}
