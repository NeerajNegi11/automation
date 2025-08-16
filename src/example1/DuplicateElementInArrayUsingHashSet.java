package example1;

import java.util.HashSet;

public class DuplicateElementInArrayUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str [] = {"words" , "amit", "Words", "amit", "90", "90" };
		HashSet <Object> map = new HashSet <Object>();
		HashSet <Object> duplicate = new HashSet <Object>();
	
		for (String a : str)
		{
		// Return false if string is already added present in map
		if(!map.add(a)) 
		{		
	    duplicate.add(a);
		}
		}
		System.out.println(duplicate);
				
		}
	}


