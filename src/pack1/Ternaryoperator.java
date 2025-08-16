package pack1;

public class Ternaryoperator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    int a =10, b=20, c=30;
    int result = (a< b) ? a : b ;
    
    int max = (a > b) ? ((a < c) ? a : c) : ((b > c) ? b : c);
    System.out.println("Max :" + max);
    System.out.println(result);
    
	}
}
