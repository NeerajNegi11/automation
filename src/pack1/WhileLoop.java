package pack1;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// intialize and declare the variable 1st
		int i= 1;
		
		// loop Condition is checked if true then goto the inside block and run the code
		while (i<5)
		{
			System.out.println("Hello World");
			// if user doesn't increment/decrement the value of i, loop will run forever as i value will be always 1
			/// and condition will be true
			i +=1;			
		}
		
		// Print odd number
	/*	int j=1;
		while (j< 10) {
			if(j%2==1)
				System.out.println(j);
			j++;
		}
		
		// another way to print odd number
		int k=1; 
		while(k<10)
		{
			System.out.println(k);
			k = k+2;
		} */
		
		int m=10;
		while (m >0) {
			
			if (m%2 ==1)
				System.out.println(m);
			m--;
		}
		
	}

}
