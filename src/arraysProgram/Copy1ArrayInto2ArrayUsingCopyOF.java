package arraysProgram;

import java.util.Arrays;

public class Copy1ArrayInto2ArrayUsingCopyOF {

	public static void main(String[] args) {
		int arr[] = {34, 65, 34, 12, 75, 33,12 };
		int arr1[] = new int [arr.length];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		
		for (int arr2 : arr1) {
			System.out.print(arr2 + " ");
		}

	}
}
