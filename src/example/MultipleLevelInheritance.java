package example;

interface  Parent1 {
	 static void display() {
		System.out.println("Hello world parent 1");
	}
 

	 interface  Parent2 extends  Parent1  {
	  static void display2() {
			System.out.println("Hello world parent 2");
		}
	 
}

 class child implements  Parent2
{
	static void display1() {
		Parent2 obj = new child();
	
		
		System.out.println("Hello world child");
	}
}

public class MultipleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj3 = new child();
	

	}

}
