package Lambda;

public class LambdaExpressionUsingInterface {

	public static void main(String[] args) {
		
		InterfaceExample obj = (a,b) -> {
		        int z = a-b;
				System.out.println(z);
				int add = a+b;
				System.out.println(add);
				
				
		};
		obj.print(9, 5);
		
		InterfaceExample obj1 = (s,t) -> {
	        int y = s*t;
			System.out.println(y);
	};

	obj1.print(9, 3);
	
	}
}
