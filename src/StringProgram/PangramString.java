package StringProgram;

public class PangramString {

	public static void main(Stringpro[] args) {
		// TODO Auto-generated method stub
		// if string have all a-z alphabets in string
		// String s= "The quick brown fox jumps over the lazy dog'
		
		Stringpro s = "The quick brown fox jumps over the lazy do";
		s.toLowerCase();
		int length = s.length();
		//int index = s.indexOf('s');
		Boolean pangram = true;
		
		System.out.println(s.replaceAll("\\s", "").length());
		if(length <26) 
		{
			System.out.println("String s is not pangram : " + s );
		}
		else 
		{
			for (char ch = 'a'; ch <='z'; ch++) // ascii code	
		{
				if (s.indexOf(ch) <0)  /// if alphabet is not present
		   {
					 pangram = false;
					
		   }}
			if(pangram) {
		System.out.println("String s is  pangram : " + s);
			}
			else {
				System.out.println("String s is  pangram : " + s);
			}
		}
		
	}
		}				
	

