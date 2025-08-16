package pack1;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
	    int b= 20;
	    
	   if(a>b) {
		   System.out.println("a is greater than b" );
	   }
       else if(a==b)
       {
    	   System.out.println("a is equal to b");
       }
       else {
    	   System.out.println("b is greator than a");
       }
	   
	   System.out.println(a==b);
	   System.out.println(a>=b);
	   System.out.println(a<=b);
	   System.out.println(a!=b);
	}
}
