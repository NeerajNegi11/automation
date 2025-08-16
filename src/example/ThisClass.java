package example;

public class ThisClass {
	
	String name;
	int num;
	
	ThisClass() {
		System.out.println("Hello world program");
	}
	
	  ThisClass(int x) {
		this();
		System.out.println(x);
		
	}
	  
	  
	void method (String s){
	
		System.out.println(s);
	} 
	

	  void method1(String nam, int nu){
		this.method("sugar");
		this.name = nam;
		this.num = nu;
		
	}
	  void method2 () {
		  System.out.println(name + " " + num);
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisClass obj = new ThisClass(34);
		ThisClass obj1 = new ThisClass(); 
		obj1.method1("amit", 10);
		obj1.method2();
		
	
	}

}
