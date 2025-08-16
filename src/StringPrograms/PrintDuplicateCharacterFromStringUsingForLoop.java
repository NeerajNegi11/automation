package StringPrograms;

public class PrintDuplicateCharacterFromStringUsingForLoop {

	public static void main(String[] args) {
		
	String str = "hello world";
	str =  str.trim().toLowerCase().replaceAll("\\s+", "");
	char [] ch = str.toCharArray();
	boolean check [] = new boolean [ch.length];
	for (int i = 0 ; i< ch.length; i++)
	{
	   if (check[i] == true)
	   {
		continue;
	   }
	   int count = 1;
	   for (int j= i+1 ; j < ch.length ; j++)
	   {
			if (ch[i] == ch[j] ) 
			{
			count ++;
			check [j] = true; 
			}   
	   }
	   if (count > 1)
	   {
	    System.out.println(ch[i] +" " +  count);   
	   }	   
	 }
	}
}
