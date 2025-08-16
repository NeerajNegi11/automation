package example;

public class WrapperClass {
	int x = 10;
	double salary = 48548.45;
	Boolean z = true;
	char ch = 'c';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperClass obj = new WrapperClass();
		
		Integer y = obj.x;
		System.out.println(y);
		Double salary1 = obj.salary;
		System.out.println(salary1);
		Boolean value = obj.z;
		System.out.println(value);
		Character ch1 = obj.ch;
		System.out.println(ch1);
		
		// Converting primitive data type into string
		String  s = String.valueOf(obj.x);	
		System.out.println(s);
		String s1 = Double.toString(obj.salary);
		System.out.println(s1);
		String s2 =  Boolean.toString(obj.z);
		System.out.println(s2);
		
		// Converting String into different primitive data type
		String str = "6557";
		String bool = "true";
		int num1 = Integer.valueOf(str);
		int num2 = Integer.parseInt(str);
		boolean bool1 = Boolean.valueOf(bool);
		boolean bool2 = Boolean.parseBoolean(bool); 
		// cannot convert string into int through String class
		//int num3 = String.valueOf(str);
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println(num3);
		System.out.println(bool1);
		System.out.println(bool2);
			
	}
}
