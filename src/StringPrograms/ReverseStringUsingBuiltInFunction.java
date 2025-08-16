package StringPrograms;

public class ReverseStringUsingBuiltInFunction {

	public static void main(String[] args) {
	
	String s = "  Hello   World  ";
	s = s.trim().replaceAll("\\s+", " ");
	StringBuilder str = new StringBuilder(s);
	str.reverse();
	System.out.println(str);

	}
}
