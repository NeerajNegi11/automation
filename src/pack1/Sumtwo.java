package pack1;

public class Sumtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// int, double or boolean assignment and declaration can be done separately
		// we can change variable value once datatype is defined and only variable is changed
		int a;
		a= 5;
		a= 10;
		int b = 8;
		 b= 10;
		
		//var datatype declaration and assignment is done at same time
		var c = 2.6556;
		c = 2.45;
		
		
		var sum = a+b;
		var sub = a-b;
		a += b;
		b -= a;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		System.out.println(a);
System.out.println(b);
System.out.println(a+b);
System.out.println(c);
	}

}
