package arraysProgram;

public class SearchAnElement {

	public static void main(String[] args) {
	int a[] = {10,20,78, 90};
	int z = 78;
	int index = linearSearch(a, z);
	if (index == -1)
	{
	System.out.println("Search element " + z + " is not found ");
	}
	else 
		System.out.println("Search element " + z + " is  found ");
	}

	private static int linearSearch(int[] a, int z) 
	{
		for (int i= 0; i < a.length; i++)
		{
			if (a[i] == z) 
			{
				return 1;
			}
			
		}
		return -1;
		
	}
}





