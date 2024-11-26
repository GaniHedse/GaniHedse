package array_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AL_Console {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<5; i++) {
			String val = sc.next();
			l.add(val);
			
		}
		
		System.out.println(l);
	}

}
