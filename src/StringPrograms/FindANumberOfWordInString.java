package StringPrograms;

public class FindANumberOfWordInString {

	public static void main(String[] args) {
    
		String s  = "  Hello  World   program 6565";
		s =  s.trim().replaceAll("\\s+", " ");
		
		String str [] = s.split(" ");
	    int length = str.length;
		System.out.println(length);

	}

}
