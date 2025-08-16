package example;

public class ConstructorOverloading {
	
	int n;
	String str;
	String str1,  str2 ;
	
	ConstructorOverloading()
	{
		System.out.println("Hello world program");
	}
	
	ConstructorOverloading(int n)
	{
		this.n = n;
		System.out.println("Number is " + n);
	}
	
	ConstructorOverloading(String str)
	{
		this.str = str;
		System.out.println("Number is " +str);
	}

	 ConstructorOverloading(String str1, String str2, int n)
	{
		System.out.println("My name is " + str1 + " "+ str2+ " and age is " +  n);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    new ConstructorOverloading();
	    ConstructorOverloading obj = new ConstructorOverloading(45);
	    
		new ConstructorOverloading("priya");
		new ConstructorOverloading("priya", "rawat", 90);
	}

}
