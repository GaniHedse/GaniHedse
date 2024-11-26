package java_programs;

import java.util.Scanner;

public class ReadingStringValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String fn = sc.next();
		
		System.out.println("Enter your last name: ");
		String ln = sc.next();
		
		System.out.println("Your full name is: "+fn.concat(ln));
		
		

	}

}
