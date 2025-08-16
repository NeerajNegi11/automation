package StringPrograms;

import java.util.Arrays;

public class ReverseEachWordInString {

	public static void main(String[] args) {
	
		String s = " Hello  Nitin   level ";
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		String words [] = s.split(" ");
		//System.out.println(Arrays.toString(words));
		
		for (String word : words)
		{
		char ch[] =  new char [word.length()];
		for (int j = 0; j < word.length() ; j++)
		{
		ch [j] = word.charAt(word.length()-j-1);
		}
		String reverse = new String(ch);
		System.out.print(reverse + " ");
		
		}
	}
}
