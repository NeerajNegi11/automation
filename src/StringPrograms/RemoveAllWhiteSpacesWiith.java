package StringPrograms;

public class RemoveAllWhiteSpacesWiith {

	public static void main(String[] args) 
	{
	String s = " HellOj  pjava  world";
	s =  s.trim();
	s = s.replaceAll("\\s+", " ");
	StringBuilder result = new StringBuilder();
	for (int i =0; i< s.length(); i++)
	{
	char ch = s.charAt(i);
	if (ch == ' ') 
	{
	result.append("%20");
	}
	else
	{
	result.append(ch);
	}
	}
	System.out.println("Encoded String" + result.toString());
	
	String str = " java   program ";
    str = str.trim().replaceAll("\\s+", " ");
    str = str.replaceAll(" ", "%20");
    System.out.println(str);
	
	}
}
