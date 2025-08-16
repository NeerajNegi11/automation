package Lambda;

public class TernaryOperator {

	public static void main(String[] args) {
	
	int a = 100 , b=580, c=3000;
	
	int largest = (a>b) ? ((a>b) ? a:b) : ((b>c)? b:c);
	
	System.out.println(largest);
	if (a> b && a>c)
	{
    System.out.println("Largest number is " + a);		
	}
	else if (b>a && b>c)
	{
	System.out.println("Largest number is " + b);	
	}
	else
	{
	System.out.println("Largest number is " + c);
	}
	
	}
}
