package StringPrograms;

public class CountVowelsConsonantInStringUsingLoop {

	public static void main(String[] args) {
		String s = "HellOj pjava world";
		// Convert to lowerCase
		s= s.toLowerCase();
		
		int vowelcount = 0 ;
		int consonantcount = 0 ;
		
		for (int i =0 ; i< s.length(); i++)
		{
		char ch = s.charAt(i);
		if (Character.isLetter(ch))
		
		{
		if (ch == 'a' || ch == 'e' || ch == 'i' ||  ch == 'o' || ch == 'u')	
		{
		vowelcount ++;
		}
		else{
		consonantcount ++;
		}
		}
		}
		System.out.println("Vowel count is " + vowelcount);
		System.out.println("consonant count is " + consonantcount);
      
	}

}
