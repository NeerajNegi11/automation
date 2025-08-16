package arraysProgram;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
	int arr[] = {34, 34,65, 34, 34, 12, 75, 33,12 }; 
    boolean don []=  new boolean [arr.length];
	
 
    for (int i=0; i<arr.length ; i++)
	{
    	 //boolean don []=  new int [arr.length];	
		int count =1;
		boolean Duplicate = false;
	    if(don[i]) {
		continue;
		}
	
		for(int j=i+1 ; j <arr.length ; j++)
		{
			if (arr[i] == arr[j]) 
			{
				count ++ ;
				Duplicate = true;
				don [j]= true;
			}
		}
		don[i] = true;
		if(Duplicate)
		{
			System.out.println(arr[i] + " " + count);
		}
    }
	}
}
