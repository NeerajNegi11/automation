package packagenew;

import java.util.Arrays;

public class UsingInBuiltMethodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch [] = {'D', 'K', 'T','W', 'O'};
		String s [] = {"zuber", "kiran", "anita", "shilpa" , "sumit"};
		
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(s));
		Arrays.sort(ch);
		Arrays.sort(s);
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(s));
	}

}
 