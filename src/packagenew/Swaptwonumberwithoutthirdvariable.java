package packagenew;

public class Swaptwonumberwithoutthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// swap number using variable
		
int a =10; int b=20;
int temp =0;
temp = a;
a=b;
b= temp;

System.out.println("a is " + a);
System.out.println("b is " + b);

///swap number without variable.
int a1=10; 
int a2=30;
a1= a1+a2;  // 
a2= a1-a2;   // a1+a2 -a2
a1= a1- a2 ; /// a1+a2-a1
System.out.println(a1);
System.out.println(a2);

	}
}
