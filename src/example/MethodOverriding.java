package example;

class a {
	
	double interest() {
		return 5.5;
	}
	
	 void account (int acc) {
		System.out.println(acc);
	}
}

class b extends a 

{
	int ab;
	double interest(int a) {
	return 3.5;

	}
	 void account (int acc) {
		System.out.println("this is overriden methiod " + acc);
	}
	void account(int a, int b) {
		System.out.println(a +  " " +b);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   b obj = new b();
		double val = obj.interest(5);
		System.out.println(val);
		obj.account(10);
		obj.account(15, 01);
		
		
	}

}
