package example;
import example1.PrivateAccessModifier;

public class ClassExample1 extends PrivateAccessModifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// u can access different package method only if class is public and method as public/protected
// u can't access without static method directly by class. u need to crate class object 1st then call method
		
		// Protected method outside package can be called by subclass only using extends
		PrivateAccessModifier.Display();
		
// Public static method can be intiated outside package directly
		PrivateAccessModifier.Display2();

// u can't access any method having default , private as access modifier 
		//PrivateAccessModifier.display3();
		
		PrivateAccessModifier obj = new PrivateAccessModifier();
		obj.Display1();
	    
	}

}
