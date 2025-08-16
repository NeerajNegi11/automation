package StringPrograms;

public class CountVowelsConsonantInString {

	public static void main(String[] args) {
	
	String s = "HellOj pjava world";
	// Convert to lowerCase
	s= s.toLowerCase();
    
	// Remove all special character, number and space
	String cleaned  = s.replaceAll("[^a-z]", "");
	System.out.println(cleaned);
	
	// Now remove all vowel ad count consonant
	String constant = cleaned.replaceAll("[aeiou]", "");
	int constantlength = constant.length();
	System.out.println(constant);
	System.out.print("Constant count is : " + constantlength);
	System.out.println();
	
	// Now remove all constant and count vowel
	String vowel = cleaned.trim().replaceAll("[^aeiou]", "");
	int vowellength = vowel.length();
	System.out.println(vowel);
    System.out.println("Vowel count is : " + vowellength);

	}
}
