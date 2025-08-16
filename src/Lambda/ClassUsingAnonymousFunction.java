package Lambda;

public class ClassUsingAnonymousFunction {

public static void main(String[] args) {
	ClassExample obj = new ClassExample() {
		public void display () {
			System.out.println("This is Anonymous class example 1 override");
		}
		public void print () {
			System.out.println("This is Anonymous class example 1 override");
		}
		
	};
	obj.display();
	obj.print();
	
	ClassExample obj2 = new ClassExample () {
		public void display () {
			System.out.println("This is Anonymous class example 2 override 1");
			method();
		}
		public void print () {
			System.out.println("This is Anonymous class example 2 override 2");
		}
		public void method () {
			System.out.println("This is an extra method inside anonymous class");
		}
		};
		obj2.display();
		obj2.print();
		
		 
	
	InterfaceExample obj1 = new InterfaceExample () {

		@Override
		public void print(int a, int b) {
			int z = a+b;
			System.out.println(z);	
			
		}	
	};
	InterfaceExample obj3 = new InterfaceExample () {

		@Override
		public void print(int a, int b) {
			int y = a*b;
			System.out.println(y);	
		}	
	};
	obj1.print(5, 6);
    obj3.print(5, 4);
	}
}
