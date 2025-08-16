package packagenew;

import java.util.Arrays;
import java.util.Scanner;

public class ReadArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = new int [5];
		
		try (Scanner scanner = new Scanner(System.in)) {
			for (int i=0 ; i< arr.length; i++) {
				System.out.println("Enter a number ");
				arr[i] = scanner.nextInt();
			}
		}
		
		System.out.println("Entered array is" + Arrays.toString(arr));
		

	}

}
