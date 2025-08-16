package StringPrograms;

public class CountOccurencesOfSubString {

	public static void main(String[] args) {
	String str = "Hehlleo Hello world programhe" ;
	str = str.toLowerCase().trim().replaceAll("\\s+", "");
	char [] ch1 = str.toCharArray();
	System.out.println(str);
	String substr = "he";
	
	
	char[] ch = substr.toCharArray();
	System.out.println(ch);
	int count = 0;
	for (int i=0; i < str.length()-1; i++)
	{
			if (ch1[i] == ch[0] && ch1[i+1] == ch[1])
			{
				count++;	
			}
	}
	System.out.println(substr + " count is " + count);
	}
}
