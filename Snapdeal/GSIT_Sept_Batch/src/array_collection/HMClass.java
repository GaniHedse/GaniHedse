package array_collection;

import java.util.HashMap;
import java.util.Map;

public class HMClass {

	public static void main(String[] args) {
		
		Map<Integer, String> obj = new HashMap<Integer, String>();
		
		obj.put(101, "Prabhu");
		obj.put(102, "Ayan");
		obj.put(103, "DeepShikha");
		obj.put(100, "Niharika");
		obj.put(106, "Manas");
		obj.put(108, "Ayan");
		
		System.out.println(obj);
		
		System.out.println(obj.get(103));
		
		boolean val =  obj.containsKey(118);
		System.out.println(val);
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Jan", 1);
		map.put("Feb", 2);
		map.put("Mar", 3);
		map.put("Apr", 4);
		map.put(null,  5);
		
		System.out.println(map);
		
		map.remove("Mar");
		System.out.println(map);
		
		map.clear();
		
		System.out.println(map);
		
		
		

	}

}
