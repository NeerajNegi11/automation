package StringProgram;

import java.util.Arrays;

public class CountWordsInString {

	public static void main(Stringpro[] args) {
		// TODO Auto-generated method stub
		Stringpro s = " Hello java   program";
// trim function will trim at start and end of words. split \\s+ it matches 1 or more whitespaces
		
	// 1st approach
		Stringpro[] arr = s.trim().split("\\s+");
		int length = arr.length;
		System.out.println(arr[2]);
		System.out.println(length);
		
	//2 approach using for loop
		
		int count = 0;
		for (int i=0; i<= s.length()-1; i++)
		{
			// check if space is after word but not preceded with space again
			if (s.charAt(i) == ' ' && s.charAt(i+1)!= ' ')
				
			{
				count = count +1;
			}
		}
		
        System.out.println(count);
	}

}
