package StringProgram;

public class ReplaceString {

	public static void main(Stringpro[] args) {
		// TODO Auto-generated method stub
		Stringpro str1 = "$1,23,90";
        Stringpro s1 = str1.replace("$","").replace(",","");
        System.out.println(s1);
        
        Stringpro str = "Abc 012..##  10cbA";
        str = str.toLowerCase();
       str = str.replaceAll("[^a-zA-Z]", "");
       str = str.trim();
        System.out.println(str);
        
        //Will replace white spaces from String
        Stringpro str2 =  "  N  ee  ra j  Ne  gi";
        str2 = str2.replaceAll("\\s", "");
        System.out.println(str2);
        

	}
}
