package pack1;


//Demonstrating the working of Abstraction

interface Animal {
	 void sound();
	}


/*If a class implements an interface and does not provide method bodies
for all functions specified in the interface, then the class must be declared abstract. */
//Abstract class Dog Implement Animal {}

class Dog implements Animal {
	public void sound() {
		System.out.println("Wooo");
	}
}


 public class InterfaceExample {
	public static void main(String[] args)
	{
		Dog mydog = new Dog();
		mydog.sound();
	}
	
}


