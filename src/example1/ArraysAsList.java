package example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

public static void main(String[] args) 
{
	
Integer arr[] =  {10, 12, 14, 16, 18, 20};
Integer arr3[] = {10, 12, 14, 16, 18, 10};
for (Integer a : arr)
System.out.print(a + " ");
System.out.println();

// Arrays.asList convert an array into fixed size list
List <Integer> arr1 = Arrays.asList(arr);
System.out.println(arr1);

// If you want a modifiable list, wrap it in ArrayList
List <Integer> arr2 = new ArrayList <> (Arrays.asList(arr));
arr2.add(11);
System.out.println(arr2);

// Arrays.sort : sort the array in ascending order
Arrays.sort(arr);
for (int a : arr)
System.out.print(a + " ");
System.out.println();

// Arrays.binarySearch() : search number index inside an array
int number =16;
int index = Arrays.binarySearch(arr, number);
System.out.println(index);
int index1 =  Arrays.binarySearch(arr, 0, 1, number);
System.out.println(index1);

// Arrays.compare(arr1, arr2) : return 0 if equal, -1 if arr2 greater, 1 if arr1 greater
int  result = Arrays.compare(arr, arr3);
System.out.println(result);

//Arrays.toString() :  convert array into string format
String s = Arrays.toString(Arrays.copyOf(arr,5));
System.out.println(s);

//Arrays.deepEquals(arr, arr3)
System.out.println(Arrays.deepEquals(arr, arr3));
System.out.println(Arrays.equals(arr, arr3));

// Arrays.stream : is ued to convert array into stream
Arrays.stream(arr3);
for ()
}
}
