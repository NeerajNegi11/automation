package LogicalProgramming;

public class ReverseANumber {

	public static void main(String[] args) {
	int num =12345;
	int reverse= 0;
	
	while (num!=0)
	{
		int remainder = num %10;
		reverse = 10*reverse + remainder;
		num = num /10;
	}
    System.out.println(reverse);
	}

}
