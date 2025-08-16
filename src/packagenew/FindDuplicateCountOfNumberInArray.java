package packagenew;

public class FindDuplicateCountOfNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {12, 45, 54, 78, 73, 54, 90,54};
		int num =54;
		int count =0;
		for (int x: arr)
		{	
			if (x==num)
				count ++;
		}
		System.out.println("Number count of " + num + " is " + count);
	}
}
