package example1;

 public class NewClass extends PrivateAccessModifier {
	 
	protected  static  void display()
		{
			System.out.println("New program");
		}
	// this is method overriding and its access modifier should be same
	  public void display1 ()
	 {
		 System.out.println("Welcome to new india");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Static method are shared by all member of the class
		PrivateAccessModifier.Display();
	
		// Non Static need to create object 1st to call that class method 
		PrivateAccessModifier obj = new PrivateAccessModifier();
		
		obj.Display1();
		obj.Display3();
		
		NewClass obj1 = new NewClass();
		obj1.Display1();
		obj1.Display3();
		
		System.out.println(num1);
		
	}

}
