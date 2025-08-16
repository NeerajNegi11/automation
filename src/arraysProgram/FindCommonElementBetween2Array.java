package arraysProgram;

public class FindCommonElementBetween2Array {

public static void main(String[] args) {
    int arr[] = {34, 65, 34, 12, 75, 33, 12};
    int arr1[] = {34, 67, 45, 33, 90, 90};
    
   // common element are 34, 33 only
 	// start loop from 1st array 
    // continue the loop if number repeat in 1st arr twice
 	// start loop from 2 nd array
 	// start compare arr 1st elemnt with arr2 all element
 	// if found equal then print else continue looping in increment order for for loop

    System.out.println("Unique common elements:");

    for (int i = 0; i < arr.length; i++) {

        // Check if arr[i] is already printed (to avoid duplicates)
        boolean alreadyPrinted = false;
        for (int k = 0; k < i; k++) 
        {
            if (arr[i] == arr[k]) 
            {
                alreadyPrinted = true;
                break;
            }
        }

        if (alreadyPrinted) 
        {
            continue;
        }

        // Compare with all elements in arr1
        for (int j = 0; j < arr1.length; j++) 
        {
            if (arr[i] == arr1[j]) 
            {
                System.out.println(arr[i]); // <-- Fixed here
                break;
            }
        }
    }
    
}}