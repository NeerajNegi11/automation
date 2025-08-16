package StringPrograms;

public class CountOccurencesOfSubString2 {

	public static void main(String[] args) {
		String str = "Hehlleo Hello world programhe" ;
		str = str.toLowerCase().trim().replaceAll("\\s+", "");
		char [] ch1 = str.toCharArray();
		String substr = "he";
		char [] ch = substr.toCharArray();
		int count = 0;
		
		for (int i=0 ;  i< ch1.length ; i++)
		{
		String current = str.substring(i, i+ substr.length());
		if (current.equals(substr))
		{
		count ++ ;	
		}
		}
	}
}
