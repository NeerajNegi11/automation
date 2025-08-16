package pack1;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		try (Scanner scanner = new Scanner(System.in)) {
			//int a = scanner.nextInt();
			//int b = scanner.nextInt();
			//int c = scanner.nextInt();
			
		int a = 1000;
		int b= 500;
		int c =3000;
		
		int maxnumber = ((a>b) ? ((a>c) ? a:c) : ((b>c) ? b:c));
		System.out.println(maxnumber);
		
		if (a>b && a>c) {
			System.out.println("Max number is "  +  a);
		}
		else if (b>a && b>c)
		{
			System.out.println("Max number is "  +  b);
		}
		else if (c>a && c>b)
		{
			System.out.println("Max number is "  +  c);
		}
		}
	}

}
