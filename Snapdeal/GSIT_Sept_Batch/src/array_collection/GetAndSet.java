package array_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetAndSet {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>(); // Generic Collection

		l1.add("Neha");
		l1.add("Deepa");
		l1.add("Manas");
		l1.add("Nikita");
		l1.add("Prabhu");
		l1.add("Manas");

		System.out.println(l1);
		
		System.out.println(l1.get(1));
		
		l1.set(2, "Abhishek");
		System.out.println(l1);
		
		Collections.reverse(l1);
		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println(l1);
		

	}

}
