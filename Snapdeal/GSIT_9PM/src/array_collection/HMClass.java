package array_collection;

import java.util.HashMap;

public class HMClass {

	public static void main(String[] args) {
	
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Meena");
		map.put(104, "Rahul");
		map.put(102, "Ankita");
		map.put(106, "Meena");
		map.put(102, "Meena");
		
		System.out.println(map);
		
		boolean res = map.containsKey(104);
		System.out.println(res);
		
		map.remove(106);
		
		System.out.println(map);
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("Manas", 80);
		map1.put("Shubham", 89);
		map1.put("Kaushlandera", 90);
		
		System.out.println(map1);
		
		System.out.println(map1.get("Mani"));
	}

}
