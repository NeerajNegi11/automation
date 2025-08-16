package packagenew;

public class DifferentDataTypeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object arr [] [] = {{1,2.5, true}, {5,6,7 }};
		//System.out.println(arr.length);
		for (int i=0; i<arr.length; i++)
		{
			for (int y=0; y< arr[i].length; y++) 
			{
				System.out.print(arr[i][y] + " ");
			}
			System.out.println(" ");	
		}
		
	}

}
 