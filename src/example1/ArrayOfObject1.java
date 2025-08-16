package example1;

public class ArrayOfObject1 {
	int number;
	String name;
	
	ArrayOfObject1(int rollno, String firstname)
	{
		this.number = rollno;
		this.name = firstname;	
	}

	public static void main(String[] args) {
	
		ArrayOfObject1 [][] arr = new ArrayOfObject1 [2][2];
		arr[0][0] = new ArrayOfObject1 (1, "Amit");
		arr[0][1] = new ArrayOfObject1 (2, "Aman");
		arr[1][0] = new ArrayOfObject1 (3, "Sumit");
		arr[1][1] = new ArrayOfObject1 (4, "Sonam");
		
		for(int i=0; i < arr.length; i++ )
		{
			for (int j =0; j < arr[i].length; j++) 
			{
				ArrayOfObject1 obj =   arr[i][j];
				System.out.println(obj.number + " " +obj.name);
				//System.out.println(a[i][j]);
			}
		}
	}
}
