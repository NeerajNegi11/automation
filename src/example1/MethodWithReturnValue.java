package example1;

public class MethodWithReturnValue {
	
	
	public static   double average (double x, double y) {
		double result = (x+y)/2;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double x= MethodWithReturnValue.average(23.6655, 87.76778);
		System.out.println(x);
		MethodWithReturnValue obj = new MethodWithReturnValue();
		double x1 = obj.average(45, 56);
		System.out.println(x1);
		System.out.println(new MethodWithReturnValue().average(50.6655, 50.76778));

	}

}
