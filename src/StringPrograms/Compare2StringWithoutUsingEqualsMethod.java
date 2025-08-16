package StringPrograms;

public class Compare2StringWithoutUsingEqualsMethod {

	public static void main(String[] args) {
		String str = "Hello program";
		String str1 = "Hello program";
		Boolean same = true;
		
		if (str.length()!= str1.length())
		{
			same = false;
		}
		else
		{
			for (int i= 0; i<str.length() ; i++)		
			{
			if (str.charAt(i)!= str1.charAt(i))
				{
				same = false;
				break;
				}
			}
		}
		
		if (same)
		{
			System.out.println("equal");	
		}
		else 
		{
			System.out.println("Not Equal");
		}
			
	}
}
