package pack1;

// Is a user-defined blueprint or prototype from which objects are created.
public class StringType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "supr";
		name = "This is my world";
		name = "oo my god";
		

		int a= 10;
		// Int can be modified even after intialization and declaration
	     a = a + 5;
		System.out.println(a);
		
		/*String once created, their contents cannot be changed.
		Every modification to a String (like concat, replace, etc.) creates a new object in memory.
		For heavy or repeated string manipulations (e.g., loops, appends), use StringBuilder:
		// String can't be modified once intialize and declare
		//name = mame + "world";
			 */
		
		System.out.println(name);
       
	}

}
;