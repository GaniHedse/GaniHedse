package array_collection;

import java.util.ArrayList;
import java.util.Collections;

public class AL_GetSet {

	public static void main(String[] args) {
		
      ArrayList<String> l = new ArrayList<String>();
		
		l.add("Manas");
		l.add("Dharvind");
		l.add("Meena");
		l.add("Jyothasana");
		l.add("Shubham");
		l.add("Lalitha");
		
		
		  ArrayList<Integer> l1 = new ArrayList<Integer>();	
		  
		  l1.add(110);
		  l1.add(102);
		  l1.add(111);
		  l1.add(106);
		  l1.add(118);
		  l1.add(101);
		
	System.out.println(l);
       System.out.println(l.get(4));
       l.set(4, "MallikaArjun");
       
       System.out.println(l1);
       
       Collections.sort(l1);
       System.out.println(l1);
       
       Collections.reverse(l1);
       System.out.println(l1);
       
	}

}
