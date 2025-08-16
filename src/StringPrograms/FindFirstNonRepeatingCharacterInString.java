package StringPrograms;

public class FindFirstNonRepeatingCharacterInString {

	public static void main(String[] args) {
	
	String s = "Hellohew World Program";
	s= s.toLowerCase().trim().replaceAll("\\s+", "");
	//System.out.print(s);
	//char ch[] = new char[s.length()];
	for (int i= 0 ; i<s.length(); i++)
	{
		char current = s.charAt(i);
		Boolean IsRepeated = false;
		for (int j=0; j < s.length(); j++)
		{
//If character at position i matches any character at position j (where i ≠ j), then it's a repeating character.
			if(i!= j && current == s.charAt(j)) 
			{
			IsRepeated = true;
			break;
			}
			
		}
		// If IsRepeated is false after inner loop
		if (!IsRepeated) 
		{
		System.out.println(current);
		return;
		}
	}
	}
}
