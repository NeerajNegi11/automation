package StringPrograms;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
	
	String str = "  hHeeellohew   World  Program ";
	
	str = str.toLowerCase().trim().replaceAll("\\s+", "");
	char ch[] = str.toCharArray();
	System.out.println(ch);
	System.out.println(ch.length);
	boolean isDuplicate [] = new boolean [ch.length];
	
	for (int i=0; i < str.length(); i++)
	{
	  if(isDuplicate[i])
	  {
	  continue;	
	  }
	  
	  for (int j=i+1; j < str.length(); j++)
	  {
	    if (ch[i] == ch[j])
	    {
	    isDuplicate[j] = true;
	    }
	  }
	System.out.print(ch[i] + " ");
	}
	}
}
