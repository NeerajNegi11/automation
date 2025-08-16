package Lambda;

public class RunnableExampleUsingAnonymousLambda{

public static void main (String [] args) {

	InterfaceExample obj = new InterfaceExample () {

		@Override
		public void display() {
		System.out.println("Hello we are calling interface method inside class using anonymous class");	
		}		
	};	
	obj.display();
	
	ClassExample obj1 = new ClassExample () {
		public void display () {
			System.out.println("This is Anonymous class example from parent class");
		}
	};
	obj1.display();
	
/// Here Runnable interface should be implemented by any class whose instances are 
// are intended to be executed by Thread instance	
Runnable r = new Runnable() 
{
    @Override
    public void run() 
    {
    System.out.println("Running in thread");
    } 
};

Thread t = new Thread(r);
t.start();

//Using a lambda expression

Runnable task2 = () -> {
	System.out.println("This is lambda expression");
};
Thread t2 = new Thread (task2);
t2.start();

}
}