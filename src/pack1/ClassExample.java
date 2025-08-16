package pack1;


/*Concept	Represents	                      Can Contain	         Usage
 Class	    Common properties & behaviors	  Variables + methods	 Blueprint for creating objects
 Interface	Common behaviors (methods)	     Method declarations	 Define contracts between classes
*/

public class ClassExample {
	
	// instance variable 
	String car;
	int model;
	
	// class default constructor will be called automatically when new car object is created
	// Intialize those variable when u create a new object
	 ClassExample (String car1, int model1) 
	{
		//refers to the instance variable car of the current object. 
		// car on the right is the parameter passed into the constructor.
		this.car = car1;      
		this.model = model1;
	    
	}
	 
	 // behaviour
	  void example() {
		 System.out.println("this car is "+car+ " and model is " + model);
		 
	 }
	 
	public static void main(String[] args) {
		
		// Create an object of the car class  
		ClassExample mycar = new ClassExample ("maruti", 2020);
		mycar.example();
		
	   // Access and print object properties
	    System.out.println(mycar.car);
	    System.out.println(mycar.model);
		
	}

}

