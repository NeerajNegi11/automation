package StringProgram;

public class Stringpro {

	public static void main(java.lang.String[] args) {
	
		
	//Reverse a number
	int i =12345;
	int original = i;
    int reverse = 0 ;
    int count =0;
     
	while (i !=0)
	{
	int digit =  i%10;   // get the last digit
	reverse = reverse*10 + digit;   // append the digit 
	i = i/10;    // remove the last digit
	count ++;
	}	
	System.out.print(reverse);
	System.out.println();
	System.out.println(count);
	if (original==reverse)
	{
		System.out.println("Number is palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}
	
	
	}

}
