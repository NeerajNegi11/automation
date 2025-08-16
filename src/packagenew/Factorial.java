package packagenew;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// factorial of 5 = 5*4*3*2*1
		
		int number =6;
		int factorial =1;
		
		for (int i=1; i<=number; i++)
		{
			factorial = factorial *i;
	}
		System.out.println(factorial);
	}
}
