package packagenew;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,1, 1, 2, 3, 5, 8, 13, 21, 34
// In this we 1st intialize, declare and print 0,1 		
int num1=0; 
int num2=1;
// we take num3 as 0 to count num1 and num2
int num3= 0;
int count =5;
System.out.print(num1 + " ");
System.out.print(num2+ " ");

// now we loop to print fibanacci series
for (int i=0; i<=count; i++)
{
	// num3 value is printed
  num3= num1+num2;
 System.out.print(num3 + " ");
 // now we swap the value of num2 into num1 and num3 into num2 for further addition
 num1 = num2;
 num2=num3;
}	
	}
}
