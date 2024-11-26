package java_programs;

import java.util.Scanner;

public class ReadingStringValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first Name");
		
		String fn = sc.nextLine();
		
		System.out.println("Enter your last Name");
		
		String ln = sc.nextLine();
		
		System.out.println("Your full Name is: "+fn.concat(ln));

	}

}
