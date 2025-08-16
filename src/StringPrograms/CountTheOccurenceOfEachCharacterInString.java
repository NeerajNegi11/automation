package StringPrograms;

public class CountTheOccurenceOfEachCharacterInString {

	public static void main(String[] args) {
		String str=  "Hellohew World Program";
		str = str.toLowerCase().trim().replaceAll("\\s+", "");
		char ch [] = str.toCharArray();
		boolean [] flag = new boolean [ch.length];
		
		for (int i=0; i<str.length(); i++)
		{
		 if (flag[i])
		 {
		 continue;	
		 }
		
		 int count =1;
		 for (int j=i+1; j < str.length() ; j++)
		 {
		    if (ch[i] == ch[j])	
		    {
			count++;
			flag [j] =true;
		    }
		 }
		 flag [i] = true;
		 
		 System.out.println("Count of character " + ch[i] + " " + count);
		}
		
		
		}}
