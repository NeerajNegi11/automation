package example1;

// We cannot use top level class as private and protected
// if we use final in class it can't be accesed though any other class
 public class PrivateAccessModifier {
	 
	 // Instance variable
	 int num =30;
	 static int x =23;
	  int y = 33;
	 // class level scope variable as static variable
	 static int num1 =20;
	 
	protected static void Display() {
		 System.out.println("Hello printing press");
		 
	 }

	 String s;
	
	public void Display1()
	{
		System.out.println("Welcome to india");
	}

	public static void Display2() {
		System.out.println("Public program");
	}
	

	// Parameter scope local variable
	public  void Display3(int x)
	{
		System.out.println("Public program 3");
		// method level scope variable
		PrivateAccessModifier t = new PrivateAccessModifier();
		 PrivateAccessModifier.x = 41;    //  refers to PrivateAccessModifier.num (static variable)
          this.y =42;   // refers to this.y
          
          System.out.println(PrivateAccessModifier.x);  // static variable
          System.out.println(t.x);   //// static variable (shared)
          System.out.println(t.y);  // instance variable of t
          System.out.println(y);    // instance variable of current object
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// As display method is static and its shared by all member of the class so we don't need to create instance
		PrivateAccessModifier.Display();
		PrivateAccessModifier.Display2();
		
		
// As display1 method is not static so it can't be access directly by class object so we need to initiate it first to call this method		
		//PrivateAccessModifier.display1(); 
		PrivateAccessModifier obj = new PrivateAccessModifier();
		obj.num =10;
		PrivateAccessModifier.num1 = 50;
		
		obj.Display1();
		obj.Display3(5);
		System.out.println("Hello World");
		System.out.println(obj.num);
		System.out.println(num1);
	
	}

}
