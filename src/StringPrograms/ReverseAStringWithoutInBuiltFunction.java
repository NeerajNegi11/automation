package StringPrograms;

public class ReverseAStringWithoutInBuiltFunction {

	public static void main(String[] args) 
	{
	
	String s = "Hello World";
	int len = s.length();
	System.out.println(len);
	char ch [] = new char[len];
	for (int i = 0; i < len ;i++) 
	{
	ch[i] = s.charAt(len -i-1);
	}
    System.out.println(new String(ch));
    
	}
}
