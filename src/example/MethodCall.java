package example;

public class MethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodType obj = new MethodType ();
		
		// 1st approach - return type is null and no input param
		obj.Method1();
		
		// 2nd approach - return type is string and no input param
		String s = obj.Method2();
		System.out.println(obj.Method2());
		System.out.println(s);
		
		// 3rd approach - input type as param + no return type
	     obj.method3("Amit", 10);
		
	   // 4th approach -  input type as param + Return type

	   // String str =  obj.method4("Method with (Input type param + Return Type)");
	     System.out.println(obj.method4("Hello"));
	     
}
}