package packagenew;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Number is palindrome if reverse of number is same 
		int num =115;
		int reverse =0;
		int count = 0;
		while (num> 0) {
		 reverse = num%10;  
		count = count*10 + reverse; 
		 num = num/10;
		
		}
		if (num==count)
		{
			System.out.println("Number is palindrome number");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		System.out.println("Print number " + count);
	}
	}


