package pack1;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 30;
		// Logical and condition
		if (a>10 && b<30) {
			// if condition is true then print below 
		System.out.println("a is smaller than b, b is smaller than c");
		}
		else {
			System.out.println("Condition is false");
		}
		// Logical or condition
		System.out.println((a<b || b>c));
		
		// logical not condition
		System.out.println(!(a<b));
	}
}
