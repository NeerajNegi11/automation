package example;

public class MethodType {

	// 1)Approach 1 - Method with (No Input Type parameter + No Return Type)
	
	void Method1 ()
	{
		System.out.println("Method with No input parameter and return type");
	}
	
	// 2)Approach 2 - Method with (No Input Type parameter +  Return Type)
	
	String Method2 ()
	{
		String name = "No Input Type parameter +  Return Type" ;
		return name;
	}
	
	// 3)Approach 3 - Method with (Input type param + No return type)
	
	void method3 (String str, int num)
	{
		
		System.out.println(str + " age is " + num);
	}
	
	// 4)Approach 4 - Method with (Input type param + Return Type)
	
	String method4 (String str)
	{
		str = "Java is programming language";
		//System.out.println(str);
		
		return str; 
	}
	
	}
