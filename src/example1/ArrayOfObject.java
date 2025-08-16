package example1;

import java.util.Arrays;

public class ArrayOfObject {
	
	int n[];
	String s[];

	void display (int n[], String s []) {
		this.n = n;
		this.s = s;
	}
	
	void print () {
		System.out.println(Arrays.toString(n) + " " + Arrays.toString(s));
	}
	
	public static void main(String[] args) {
		
		ArrayOfObject obj = new ArrayOfObject();	
		int number [] = {3,5};
		String name [] = {"amit", "sumit"};
		obj.display(number, name);
		obj.print();
 
	}

}
