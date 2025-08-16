package pack1;

import java.util.Scanner;

public class EvenOddProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner (System.in)) {
			int number = scanner.nextInt();
			if (number%2 == 0)
			{
				System.out.println("Number is even number");
			}
			else {
				System.out.println("Number is odd number");
			}
		}
}
}
