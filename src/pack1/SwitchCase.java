package pack1;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();


   switch (number)
   {
			case 1: System.out.println(number + " Monday");	
			break;
			case 2: System.out.println(number + " Tuesday");
			break;
			case 3: System.out.println(number + " Wednesday");
			break;
			case 4: System.out.println(number + " Thursday");
			break;
			case 5: System.out.println(number +  " Friday");
			break;
			case 6: System.out.println(number + " Saturday");
			break;
			case 7: System.out.println(number + " Sunday");
			break;
			default: System.out.println(number + " Invalid day");
			
			}
		}	
	}
}
