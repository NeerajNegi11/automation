package example;

public class RecursionMethod {
	
	 static void Recursion(int n){
		if (n<1)
		{
			return; 
		}
		 Recursion(n-1);
		 System.out.println(n);
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		
		//RecursionMethod obj  = new RecursionMethod ();
		RecursionMethod.Recursion(n);

	}

}
