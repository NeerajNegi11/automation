package pack1;

import java.util.Scanner;

public class Ifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("what ur name : ");
		name = scanner.nextLine();
		System.out.print("what ur age : ");
		age = scanner.nextInt();
		System.out.println("Are u student");
		Boolean student = scanner.nextBoolean();
		
		
		//Group 1 to validate if name is present or not
	    if (name == "")
	    {
		System.out.println("please provide ur name");
	    }
	    else {
		System.out.println("hello " + name);
	    }
		
	    // Group 2 Whether person is eligible for vote or not
		if(age > 18) 
		{
			System.out.println("Eligible to vote");
		}
		else if (age<0)
		{
			System.out.println("warning");
		}
		else if (age==0)
		{
			System.out.println("u are just born");
		}
		else
		{
			System.out.println("Not eligible to vote");
		}
		
		// To check if person is student or not
		if(student)
		{
			System.out.println("Person is IT student");
		}
		else {
			System.out.println("Not a student");
		}

	}

}
