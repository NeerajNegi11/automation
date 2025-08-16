package StringProgram;

public class CountOccurenceOfGivenCharacterInString {

	public static void main(Stringpro[] args) {
		// TODO Auto-generated method stub
		
		Stringpro s = "Java String Example";
		s= s.toLowerCase();
		//convert string into character array to match character
		char ch [] = s.toCharArray();
		char ch1= 'r';
		// a count is 3
		int count = 0;
		
		// 1st approach using for loop to loop through string
		for (int i = 0; i<s.length(); i++)
		{
			
			if( ch1 == ch[i]) 
		{
		count = count +1;
		
		}
		}
		System.out.println("count of ch1 " + count);
		
		// 
		int length = s.length();
		int temp = s.replace("i", "").length();
		int count1 = length-temp;
		System.out.println("count of temp " + count1);
	}
}
