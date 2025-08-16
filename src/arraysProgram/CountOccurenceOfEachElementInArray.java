package arraysProgram;

public class CountOccurenceOfEachElementInArray {

	public static void main(String[] args) {
		
		int arr[] = {34, 65, 34, 12, 75, 33,12 };
		// track which element has been already counted and prevent duplicate
		boolean check [] = new boolean [arr.length];
		
		for (int i= 0; i< arr.length; i++)
		{
		// check if it is true then skip that condition move to next element
		if (check[i])
		continue;
	
		int count = 1;
		for (int j=i+1; j < arr.length; j++) 
		{
		if(arr[i] == arr[j])	
		{
			count ++;
			check[j] = true;
		}
		}
		System.out.println(arr[i] + " " + count);
		
		}
		}
	}


