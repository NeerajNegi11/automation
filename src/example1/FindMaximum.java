package example1;

public class FindMaximum {

	public static void main(String[] args) {
		int number[] = {90, 150, 67, 24, 100};
		int maximum = findMax(number);
	System.out.println(maximum);

	}
	
	public static int findMax (int n[]) {
		int max = n[0];
		for (int i : n)
		{
			if (i > max) {
				max = i;
			}	
			
	}
		return max;
	}
}
