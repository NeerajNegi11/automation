package example;

class XYZ {
	int no =12;
	void method1() {
		System.out.println("Hello world");
	}
	
}

public class UncheckedExceptions extends XYZ {
	
	void  setage(int age) throws Exception {
		if (age <18) {
			throw new  IllegalArgumentException("Age should be greater than 18");
		}
		System.out.println("Print age " + age);
	}
	
	void printname (String name)  throws Exception {
		if ( name == null || name.isBlank()) {
			throw new Exception("Invalid name");
		}
		System.out.println(name);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// java.lang.ArithmeticException
		try {int a  = 100;
		int z = a/0;
		System.out.println(z);}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
		
		// java.lang.ArrayIndexOutOfBoundsException
		try {int arr [] =  new int [5];
		arr [4] =80;
		System.out.println(arr[5]);}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
		finally {
			System.out.println("Ptint this message");
		}

		
		
		// java.lang.NullPointerException
		
		try {String s = null;
		int len = s.length();
		System.out.println(len);}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}

		// IllegalArgumentException
		try {
		try{UncheckedExceptions obj = new UncheckedExceptions();
	    obj.setage(17);
	    obj.printname("s");}
	    finally {
	    System.out.println("Nested finally block");
	    }   
		}
		catch (Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
	    // NumberFormatException
	   try { String str = "Hello";
	    int num1 = Integer.valueOf(str);
	    
	    System.out.println(num1);}
		catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			}
	    // object upcasting parent class reference child class object - u can access only parent class object
	    XYZ obj9 = new XYZ();
	     obj9.method1();

	 try { UncheckedExceptions obj8 = (UncheckedExceptions) new XYZ();
	    System.out.println(obj8.no);}
	 
	 catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			}
	 
	 System.out.println("end of the program");
	}
}
