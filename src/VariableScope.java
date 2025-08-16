
public class VariableScope {

	    // Instance Variable (belongs to each object)
	    private int instanceVar=1;
	    

	    // Static Variable (shared among all instances)
	    static int staticVar =200;
	    static int x =67;
	    // Constructor demonstrating parameter scope
	        VariableScope(int instanceVar,  int staticVar) {
	        
	        // Parameter Scope 
	        // using 'this' to refer to instance variable
	        this.instanceVar = instanceVar;
	        
	    }
	    
	    static int  method (int staticVar) {
	    	   staticVar= 56;
	    	  System.out.println(staticVar);
	    	  return staticVar;
	    }

	    // Method to demonstrate local, parameter, and block scope
	    public void showScopes(int paramVar, int x) {
	        
	        // Local Variable 
	        // only accessible in this method
	        int localVar = 20;
	       

	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Static Variable: " + staticVar);
	        System.out.println("Method Parameter: " + paramVar);
	        System.out.println("Local Variable: " + localVar);
	        System.out.println("Static Variable: " + x);

	        // Block Scope (variable only accessible inside this block)
	        if (localVar > 10) {
	            int blockVar = 5;
	            System.out.println("Block Variable: " + blockVar);
	        }

	        // Uncommenting below line would cause an error: blockVar out of scope
	        // System.out.println(blockVar);
	    }

	    public static void main(String[] args) {
	    	//VariableScope.staticVar = 34;
	    	VariableScope obj = new VariableScope(50,31);
	        obj.showScopes(30,56);
	       VariableScope.method(45);
	        
	       
	    }
}

