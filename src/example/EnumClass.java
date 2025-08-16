package example;

enum Abc {
	
// enum constant are public static final by default	
	Sunday,
	Monday,
	Tuesday
	
}

public class EnumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Abc.Monday);
		String sd = Abc.Monday.toString();
		System.out.println(sd);
		for (Abc week: Abc.values()) {
			System.out.println(week);
		}
		
		
	}

}
