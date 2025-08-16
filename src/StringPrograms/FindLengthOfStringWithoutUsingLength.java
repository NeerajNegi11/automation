package StringPrograms;

//import java.util.Arrays;

public class FindLengthOfStringWithoutUsingLength {

	public static void main(String[] args) {
	String s = " HellOj  pjava  world";
    char[] ch = s.toCharArray();
    int length =0;
    for(char c : ch)
    {
    length++;	
    System.out.println(c);
    }
    System.out.print(length);
    
	
	}
}
