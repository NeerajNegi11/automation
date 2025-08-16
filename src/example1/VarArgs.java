package example1;

public class VarArgs {
	
	public static void program (String s ,  int ... n) 
	{
	System.out.println(s);
	for (int a : n)
	System.out.print(a + " ");
	System.out.println();
	}
	public static void main(String[] args) {
	program("prohram1", 56, 78);
	program("Amit");
	}
}
