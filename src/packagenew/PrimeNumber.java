package packagenew;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int  num =7;
int count =0;

		if (num <=1) 
		    {
			System.out.println("Number is not a prime number " + num);
		    }
		
		else 
		   {
			for (int i=1; i<=num; i++) 
			   {
				if (num%i == 0) 
				count++;
			   }
		   }
		if (count == 2)
		{
		System.out.println("Number is prime number " + num);
		}
		else {
			System.out.println("Number is not prime number " + num);
		}
	
	}

}
