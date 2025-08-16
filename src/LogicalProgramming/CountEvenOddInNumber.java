package LogicalProgramming;

public class CountEvenOddInNumber {

	public static void main(String[] args) {
	int num= 2345679;
    int evencount=0;
    int oddcount =0;
	while (num !=0)
	{
		int remainder = num%10;
		num = num/10;
		if (remainder %2 ==0)
		{
			evencount++;
		}
		else 
		{
			oddcount++;
		}
	}
	System.out.println("Even count is " + evencount);
	System.out.println("Odd count is " + oddcount);
	}
}
