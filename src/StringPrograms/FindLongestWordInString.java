package StringPrograms;

public class FindLongestWordInString {

	public static void main(String[] args) {
	
	String str = " hello  world computer program  ";
	str = str.trim().toLowerCase().replaceAll("\\s+", " ");
	String [] words = str.split(" ");
	String longest = words[0];
	System.out.println(words.length);
	

	for (int i=0 ; i < words.length; i++ ) 
	{
	     
		   
		   
		 if (words[i].length() > longest.length())
		 {
		 longest = words[i];	 
		 }
	   
	}
	 System.out.println(longest);
	}
}
