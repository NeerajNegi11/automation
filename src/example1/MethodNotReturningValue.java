package example1;

public class MethodNotReturningValue {
	
	public static void function(double x, double  y) {
		double z = (x+y) /2;
		System.out.println(z);
		
	}
	void function1 (double x, double  y) {
		double z = (x+y) /2;
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodNotReturningValue.function(33, 34);
	}

}
