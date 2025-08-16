
public class Program {

	public static void main(String[] args) {
	
    int a = 10;
	int b =20;
	int c =30;
	//a += 1 ;
	//a *= 9; // a = a*9  
	System.out.println(a);
	
	boolean b1 = true;
	System.out.println(!b1);
	
	int a1 = (a>b) ? ((a >b) ? a:b) : ((a>c)? a:c);
	System.out.println(a1);
	
	if (b>a) {
		String result = "print string result";
		System.out.println(result);
	}
	//System.out.println(result);

	}
}
