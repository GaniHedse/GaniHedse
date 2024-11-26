package array_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericAL {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>(); //Generic Collection
		
		l1.add("Neha");
		l1.add("Deepa");
		l1.add("Manas");
		l1.add("Nikita");
		
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		
		l2.add(101);
		l2.add(104);
		l2.add(102);
		l2.add(108);
		l2.add(106);
		
		System.out.println(l2);
		
		Collections.sort(l2);
		
		for(int data : l2) {
			System.out.print(data+" ");
		}

	}

}
