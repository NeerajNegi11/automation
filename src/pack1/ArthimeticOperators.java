package pack1;

public class ArthimeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=3;
String s= new String("Hello");
String s1 =new String("Hello");
int result = a%b;
System.out.println(result);
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a/b);
System.out.println(a*b);

// ==  check value on stack memory as int is primitive data type so value is saved on stack and it matches 
System.out.println(a==b);
// print false as == check value of string but as is non primitive type mean s, s1 memory refernce are diff on stack 
//which value is stored in heap memmory
System.out.println(s.equals(s1));
System.out.println(s==s1);

	}

}
