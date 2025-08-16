package LogicalProgramming;

public class FindSumOFDigitInNumber {

	public static void main(String[] args) {
		int num= 5451;		 
		int sum =0 ;
		
		while(num !=0)
		{
			int reminder= num%10;
			sum =  sum + reminder;
			num = num/10;		
		}
	    System.out.print(sum);

	}
}
