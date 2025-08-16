package example;

public class Polymorphism {
	
	void method ()
	{
		int a  = 100;
		int b = 200;
		System.out.println(a + b);
	}

	
	String method (String str )
	{
		return str;
	}
	
	int method (int num)
	{
		return num;
	}

	void method (int a , int b) {
		int z = a+b;
		System.out.println(z);
	}
	
	int method (int a , int b, int c) {
		int z = a+b+c;
		return z;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism obj = new Polymorphism();
		obj.method();
		
        String str1 = obj.method("Hello my world");
        System.out.println(str1);
		
       int num1 = obj.method(90);
        System.out.println(num1);
        
        obj.method(23,78);
       int num2 = obj.method(14, 45, 36);
       System.out.println(num2);
       
	}

}
