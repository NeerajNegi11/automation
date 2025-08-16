package example;

interface Abstract1 {
	
	// 
	 int a =10;
	String s = "Hello world";
	
	 void number (int a);
	 default void show (String s){
		
		 System.out.println(s);
		 
	 }
	 static void print () {
		System.out.println("Print message");
	}
}

abstract class Abstract2 implements Abstract1 {
	public  final static String str = "Welcome";
	 String str1 () {
		String str1 = "my world";
		return str1;
	}
}
interface  Abstract3   {
   final static String str = "New world";
      int no = 78;
	default void display () {
		System.out.println("India is great country");
	}
}



 abstract class Abstraction implements Abstract1, Abstract3 {

	public static void main(String[] args) {
		
		System.out.println(Abstract3.str);
		
	
	}

	@Override
	public void number(int a) {
		
		System.out.println(a);
		
	}  
	

}
