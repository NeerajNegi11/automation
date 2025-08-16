package example1;

 class Parent 
{
	 static int a =10;
	 int b =11;
	static void show () {
		System.out.println("Static method in Parent class");
		System.out.println(a);
		/* Static method can access only static variable and method.
		System.out.println(b);
		Cannot use the this keyword within static methods.
		System.out.println(this.a);
		*/
	}
	void method() {
		System.out.println("Instance method in Parent class");
		// Non static method can access both static variable and method
		System.out.println(a);
		System.out.println(this.b);
	}

}
 class Child extends Parent {
	 static void show () {
			System.out.println("Static method in child class");
		}
		void method() {
			System.out.println("Instance method in child class");
		}
 } 


public class StaticVsInstance {
	public static void main(String[] args) {
		Parent obj = new Child();
		// Static method doesn't support runtime polymorphism as uses the reference type 
		// while non-static method uses the actual object
		obj.show();
		obj.method();
		
	}

}
