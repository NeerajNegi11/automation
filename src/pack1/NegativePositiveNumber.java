package pack1;

import java.util.Scanner;

public class NegativePositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number >0) {
			System.out.println("Number is positive number");
		}
		else if (number <0)
		{
			System.out.println("Number is negative number");
		}
		else {
			System.out.println("Number is zero");
		}
	}
}
