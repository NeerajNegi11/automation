package StringProgram;

public class StringPool {

	public static void main(Stringpro[] args) {
		// TODO Auto-generated method stub
		
		Stringpro s = "Welcome";
		Stringpro s1 = "welcome";
		Stringpro s2 = new Stringpro("Welcome");		
		// Intern() will assign constant to String Constant Pool (SCP)
		Stringpro s3 = s2.intern();
		s.concat("super");
		
		int a =10;
		int b=10;
		System.out.println(s);
        
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		System.out.println(a==b);
		System.out.println(s1 == s3);
		
        
		
	}

}
