import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {

	int a = 10;
	int b =11;
	int c =20;
	String s = "  Hello   word";
	String s2 = "6790";
	s = s.replaceAll("\\s+", "");
	System.out.println(s.length());
	String arr[] = s.split("\\s+");
	System.out.println(arr[0]);
	char ch [] = s.toCharArray();

	for (char c1 : ch)
		System.out.print(c1);
	System.out.println();
	
	int  a1 =  Integer.parseInt(s2);
	System.out.println(a1);
	
	boolean z = a>b;
	
	System.out.println(!z);
	//if (a >b || )
	int f = 7;
	System.out.println(f);
	// Return 1 only if both binary is (1 & 1 = 1) else 0
	System.out.println("f &= 0b1010: " + (f &= 0b1110));
	// Return 1 if either one is 1 or both equals to 1 (1 | 1 = 1 , 1 | 0 = 1)
	System.out.println("f |= 0b1100: " + (f |= 0b1100));
	// Return 1 only if one side is 1 if both side is 1 then it is 0 ( 1 ^ 0 = 1 , 1^1 =0)
	System.out.println("f ^= 0b1111: " + (f ^= 0b1100));	
	//left shift operator (<<) shifts all bits to the left by the given number of positions
	System.out.println("f <<= 0b1111: " + (f <<= 2));	
	// >> shift all bits to the right by given number of positions
	System.out.println("f <<= 0b1111: " + (f >>= 2));
	// it will shift 
	System.out.println("f >>> 0b1111: " + (f >> 1));
	
	try (Scanner scan = new Scanner (System.in)) {
		System.out.println("Print a number "  );
		int num = scan.nextInt();
		scan.nextLine();
		System.out.println("Print a text ");
		String str = scan.next();
		//System.out.println(s1);
		scan.close();
	}
	
	}
}
