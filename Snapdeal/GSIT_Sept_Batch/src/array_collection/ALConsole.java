package array_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ALConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> l1 = new ArrayList<String>();
		
		System.out.println("Enter the size: ");
		
		int size = sc.nextInt();
		
		System.out.println("Enter the "+size+" value: ");
		
		for(int i=0; i<size; i++) {
			String val = sc.next();
			l1.add(val);
		}
		
		for(String data : l1) {
			System.out.print(data+" ");
		}
		
		System.out.println(l1);

	}

}
