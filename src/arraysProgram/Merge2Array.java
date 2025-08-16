package arraysProgram;

public class Merge2Array {

	public static void main(String[] args) {

	int arr []= {10, 23, 67, 89};
	int arr1 []= {55, 90, 34, 12};
    int arr2 [] = new int [arr.length + arr1.length];
	
	for (int i= 0; i< arr.length; i++)
	arr2[i] = arr[i];
	
	for (int j=0; j< arr1.length; j++)
	arr2[arr.length + j] = arr1[j];
	
	for (int merge : arr2)
	System.out.print (merge + " ");
		
	}
}
