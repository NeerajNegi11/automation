package example1;

public class Break {
	
	void label () {
		boolean t = true;
		label1: {
			label2: {
				if (t) {
					break label2;
				}
			System.out.println("lable2");
			}
			System.out.println("label1");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =5;
		
		switch(number) 
		{
		case 1:
		System.out.println("Momday");
		break;
		case 2:
		System.out.println("Tuesday");
		default:
		System.out.println("Nothing");
		}
		Break obj = new Break ();
		obj.label();
	}

}
