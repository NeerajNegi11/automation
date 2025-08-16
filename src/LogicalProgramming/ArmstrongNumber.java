package LogicalProgramming;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		int num =370;
		int original = num;
		int sum =0;
		while (num !=0)
		{
			int remainder = num %10;
			int cube = (int) Math.pow(remainder, 3);
			sum += cube;
			num = num/10;
		}
		System.out.println(sum);
		
		if (original == sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Non Armstrong number");
		}
	
	}

}
