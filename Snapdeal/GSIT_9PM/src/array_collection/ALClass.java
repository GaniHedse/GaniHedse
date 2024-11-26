package array_collection;

import java.util.ArrayList;
import java.util.List;

public class ALClass {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add("Manas");
		l.add("Raman");
		l.add(102);
		l.add(true);
		l.add(112.60);
		l.add('c');
		l.add("Manas");
		
		System.out.println(l);
		
		l.remove(3);
		
		System.out.println(l);

	}

}
