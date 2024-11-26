package array_collection;

import java.util.ArrayList;

public class GenericAL {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("Manas");
		l.add("Dharvind");
		l.add("Meena");
		l.add("Jyothasana");
		l.add("Shubham");
		
		System.out.println(l);
		
		for(String data : l) {
			System.out.print(data+" ");
		}
				

	}

}
