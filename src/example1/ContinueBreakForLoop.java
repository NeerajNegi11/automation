package example1;

public class ContinueBreakForLoop {

	public static void main(String[] args) {
	
	for (int i =0 ;  i <= 10 ; i++)	
	{
		if (i==3) {
			continue;
		}
		
		if (i == 9) {
			break;
		}
		
		System.out.print(i + " ");
	}
		
	
	}

}
