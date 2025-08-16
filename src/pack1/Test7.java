package pack1;

public class Test7 {

	String car;
	int model;

	public Test7(String car, int model) {
		this.car = car;
		this.model = model;
		
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println(car + " "+ model);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test7 abc = new Test7("maruti", 2029);
       abc.display();
       System.out.println(VariableExample.geek);
	}

}
