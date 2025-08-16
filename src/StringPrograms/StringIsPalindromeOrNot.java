package StringPrograms;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
	
		String s = "   Nitin   level ";
		s= s.trim();
		s = s.replaceAll("\\s+", " ");
		String words [] = s.split(" ");
		for (String str : words)
		System.out.print(str + " ");
		System.out.println();
		System.out.println(s);
        char ch [] = new char [s.length()];
        System.out.println(ch.length);
        
        for (int i=0 ; i< s.length(); i++)
        {
        ch [i] = s.charAt(s.length()-i-1);
        }
        String reverse =  new String(ch);
        System.out.println(reverse);
        if (s.equalsIgnoreCase(reverse))
        {
        System.out.println("String is palindrome");	
        }
        else
        {
        System.out.println("String is not palindrome");
        }

	}
}

