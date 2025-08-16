package example;

public class StaticKeyword {
	
   static int count = 0;
   int num =0;
   
   StaticKeyword(){
	   count ++;
	   num ++;
   }
   
   static void display() {
	   System.out.println("Count value is " + count);
	   
   }

   void display1() {
	 System.out.println("Number value is " + num);  
	 display();
	 
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StaticKeyword obj = new StaticKeyword();
		//StaticKeyword.display();
	   
	    //display();
	    obj.display1();
		//StaticKeyword obj1 = new StaticKeyword();
		// Static variable count is increased to 2 as it's value is saved in class memory till program is running
		//StaticKeyword.display();
        // while in case of non static value count is increased to 1 only as it value destroy once object invoke is done
		//is completed and is part of object
		//obj1.display1();
        //obj1.display1();
	}
}
