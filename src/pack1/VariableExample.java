package pack1;

import java.util.Scanner;

public class VariableExample {
	// instance variable
	String name;
	int number;
	String nameo;
	int x;
	
	//    // Declared static variable
    public static String geek = "Sweta Dash";
 // static variable
   static  int count = 0; 

   
	
	// constructor intialize and declared variable value 
	VariableExample(){
		this.name =  "My name is Neeraj Negi";
		this.number = 8;
		count++; // static variable shared across all instances
        System.out.println("Count is: " + count);
	}
	// Parameter Scope
	public void testfunction(int x, String nameo) {
		this.x = x;
		this.nameo = nameo;
		
	}
public void display() {
	 System.out.println("name = " + nameo+ "x = " + x);
    
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableExample c1 = new VariableExample();
		c1.testfunction(45, "rihana");
		c1.display();
		
		System.out.println(VariableExample.geek);
		System.out.println(VariableExample.count);
	
		VariableExample naming = new VariableExample();
		System.out.println(naming.name);
		System.out.println(naming.number);
		
		
		// Declared local variable
		int a = 10;
		String message = "Hello world";
		System.out.println(a);	
		System.out.println(message);
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number is " + number);
		
		if (number >18) {
			//local variable
			String result = "Age is greater than 18";
			System.out.println(result);
			}
		else {
			System.out.println("Age is less than 18");
		}
		
		for (int i=0; i<=3; i++) {
			String loopMessage = "Iteration " + i;
		System.out.println(loopMessage);
		}
	}}

class Testmethod{
	public static void main (String[] args) {
		 System.out.println(VariableExample.geek);
	}
}
