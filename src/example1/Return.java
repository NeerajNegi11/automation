package example1;

import java.util.Random;

public class Return {
	
	void display (int num) {
		if(num>5) {
			System.out.println(num);
			return ;
		}
		else {
			num -- ;
			System.out.println(num);
		}
	}
	
	int number (int no) {
		return no;
		
	}

	public static void main(String[] args) {
    
		Return obj = new  Return ();
		obj.display(10);
		int z= obj.number(78);
		System.out.println(z);
		Random ran = new Random ();
		int y = ran.nextInt(0, 100);
		System.out.println(y);
		System.out.println(obj.hashCode());
	}

}
