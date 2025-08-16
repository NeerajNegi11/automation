package arraysProgram;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
	
	int arr[] = {34, 65, 34, 12, 75, 33,12 }; 	
	
	for (int i=0; i<arr.length; i++)
	{
		boolean flag = false;
		for (int j=0; j < i; j++)
			
		{
			if (arr[i] == arr[j])
			{
				flag = true;
				break;
			}
		}
		if (flag == false) 
		{
			System.out.println(arr[i]);
			
		}
		}
	
	
	}
    
	}


