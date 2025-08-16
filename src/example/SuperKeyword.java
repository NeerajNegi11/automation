package example;

class Demo {
	int number =10;
	Demo(){
		System.out.println("Callling immediate constructor using super keyword");
	}
	void method() {
		System.out.println("Callling immediate class method using super keyword inside method");
	}
}


class Demo1 extends Demo{
	
	Demo1(){
		super();
	}
	
	void method1() {
		System.out.println("Calling immediate class variable " + super.number);
		super.method();
		
	}
}

public class SuperKeyword extends Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword obj = new SuperKeyword();
		obj.method1();
	}

}
