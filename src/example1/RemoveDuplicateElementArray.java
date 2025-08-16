package example1;

public class RemoveDuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				int[] arr = {1, 10, 20, 10, 30, 20, 40, 50};
		        int n = arr.length;

		        for (int i = 0; i < n; i++) 
		        {
		            boolean isDuplicate = false;
		            for (int j = 0; j < i; j++) 
		            {
		                if (arr[i] == arr[j]) {
		                    isDuplicate = true;
		                    break;
		                }
		            }
		            if (!isDuplicate) {
		                System.out.print(arr[i] + " ");
		            }
		        }
		       
		    }	
	}


