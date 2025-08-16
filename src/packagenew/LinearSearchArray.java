package packagenew;

public class LinearSearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {21 ,45,67,98,100};
		int num = 67;
		Boolean flag = false;  // Number is not found
		
		// Normal for loop
        for (int i=0; i<=arr.length-1; i++ )		
		{
		if (arr[i] == num)	
		{
			System.out.println("Number is found in array " + num);
			flag = true;
			break;		
		}				
		}
		
		if (flag == false)
		{
		System.out.println("Number is not found in array " + num);
		}
		// Enhanced for loop
		for (int x: arr)
		{
			if (x==num)
			{
				System.out.println("Number is found in array " + num);
				flag = true;
				break;		
			}			
		}
		if (flag == false)
		{
		System.out.println("Number is not found in array " + num);
		}
		
	}

}
