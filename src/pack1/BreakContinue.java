package pack1;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i=1; i<=5;i++) {	
	if (i==2 || i==5 )
		// will skip the current iteration and move to next iteration
		continue;
	System.out.println(i);
}
for (int j=1; j<=5;j++) {	
	if (j==2 || j==5 )
		
	// will break the loop
		break;
	System.out.println(j);
}
	
	}

}
