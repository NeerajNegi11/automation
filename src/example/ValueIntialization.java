package example;

public class ValueIntialization {
	
	String name;
	int age;
	
	ValueIntialization(String name, int age){
		
		this.name = name;
		this.age = age;
	}
	
	/// no input + no return type
   	void method1(){
		
		System.out.println(name + " " + age);
	}
   	// input parameter with no return type
   void	method2(String name, int age) {
	   this.name = name;
	   this.age = age;
   }
	
	public static void main(String[] args) {
	
		/* ValueIntialization obj = new ValueIntialization();
		
		// Approach 1 - Intialize value to instance variable using object reference with dot
		obj.name= "Amit";
		obj.age = 30;
		obj.method1();
		
		// Approach 2 - Intialize value to instance variable using another method in class
		
		obj.method2("Sumit", 20);
		obj.method1();
		
		/// Constructor method with no parameter and no  return type required
		//ValueIntialization emp1 = new ValueIntialization();
		//emp1.method1(); */
		
		// Constructor method with  parameter and no return type required
		ValueIntialization emp1 = new ValueIntialization("Pankja" , 100);
		emp1.method1();
	}

}
