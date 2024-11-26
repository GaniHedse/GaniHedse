package array_collection;

import java.util.ArrayList;
import java.util.List;

public class ALClass {

	public static void main(String[] args) {
		
		List l = new ArrayList(); //Non Generic
		
		l.add("Manas");
		l.add("Prabhu");
		l.add(104);
		l.add(true);
		l.add(108);
		l.add(120.56);
		l.add('a');
		
		
		System.out.println(l);
		
		l.add("Manas");
		
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
	}

}
