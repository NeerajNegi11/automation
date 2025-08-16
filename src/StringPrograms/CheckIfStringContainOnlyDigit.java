package StringPrograms;

public class CheckIfStringContainOnlyDigit {

	public static void main(String[] args) {
		String s = "4454645f6";
		
		Boolean IsNumber = true;
		
		for (int i = 0 ; i < s.length(); i++)
		{
		char ch  =  s.charAt(i);
		if (!Character.isDigit(ch))
		{
		IsNumber = false;
		break;
		}}
	     
		if(IsNumber) 
		{
		System.out.println("contain number only");
		}
		else
		{
		System.out.println("Does not Contain number only");
		}
		
	}
}
