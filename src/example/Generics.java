package example;

class Example <T1, T2> {
	
	T1 rollno;
	T2 name;
	int arr [] = {1,4,6,8};
	String str [] =  new String[6];
}

public class Generics {

	
	public static void main(String[] args) {
    
		Example <Integer,String>  obj = new Example<Integer, String>();
		obj.name = "Neeraj";
		obj.rollno = 10;
		System.out.println(obj.name);
		System.out.println(obj.rollno);
		System.out.println(obj.arr[3]);
		obj.str[0] = "Sumit";
		obj.str[1] = "";
		obj.str[2] = null;
		System.out.println(obj.str[0]);
		System.out.println(obj.str[1]);
		System.out.println(obj.str[2]);
	}
}
