package pack1;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Whats your name : ");
			String name = scanner.nextLine();
			//String name = scanner.nextLine();
			
			System.out.print("What your age : ");
	        int age = scanner.nextInt();
	        
	        System.out.println("r u above 18 : ");
	        boolean ageabove18 = scanner.nextBoolean();
	        
	        	
	        System.out.println("My name is " + name);
	        System.out.println("My age is " + age);
	        System.out.println("I am eligible to drink " + ageabove18);
	        scanner.close();

	        }
	     
		    
	        }
	      
		} 
	


