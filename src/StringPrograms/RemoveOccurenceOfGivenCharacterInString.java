package StringPrograms;

public class RemoveOccurenceOfGivenCharacterInString {

	public static void main(String[] args) {
	String str = "java program";
	str= str.toLowerCase().trim().replaceAll("\\s+", "");
	//char check = 'a';
	char ch [] = str.toCharArray();
	
	for (int i= 0 ;  i< ch.length; i++)
	{
		if (ch[i] == 'a')
		{
	    continue;
			
		}
		
		System.out.print(ch[i]);
		
	}

	}

}
