package example;

import java.util.HashMap;

public class HashMapProgram {

	public static void main(String[] args) {
		
		HashMap<Integer, Comparable> map1 = new HashMap<Integer, Comparable>();
		map1.put(1, "amit");
		map1.put(2, "ankit");
		map1.put(3, "binod");
		map1.put(4, "amit");
		map1.put(6, 788);
		map1.put(8, 990);
		
		System.out.println(map1);
		
		//map1.clear();
		//System.out.println("Deleted " +map1);
		System.out.println(map1.size());
		System.out.println(map1.replace(6, "Kavya"));
		System.out.println(map1);
		map1.remove(7);
		System.out.println(map1);
		map1.compute(7, (key, val) -> 990);
		System.out.println(map1);
		System.out.println(map1.keySet());
		System.out.println(map1.toString());
		System.out.println(map1.get(3));
	}

}
