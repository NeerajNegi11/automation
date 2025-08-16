package LogicalProgramming;

public class Swap2NumberWithoutUsing3Variable {

	public static void main(String[] args) {
	int a = 10;
	int b = 21;

    a = a +b ; 
	b = a -b ; 
    a = a - b ; 
    System.out.println("A is equal to : " + a);
    System.out.println("B is equal to : " + b);

	}

}
