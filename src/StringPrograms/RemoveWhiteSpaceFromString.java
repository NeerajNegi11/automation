package StringPrograms;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String s = "  HellOj   pjava   world";
		s = s.replaceAll("\\s+", "");
		System.out.println(s);

	}

}
