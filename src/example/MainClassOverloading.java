package example;

public final class MainClassOverloading {
	
	void main (String str) {
		System.out.println("Helllo world " + str);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClassOverloading obj =  new MainClassOverloading();
		obj.main("India");
	}

}
