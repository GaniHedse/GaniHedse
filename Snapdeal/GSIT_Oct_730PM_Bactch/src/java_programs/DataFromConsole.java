package java_programs;

import java.util.Scanner;

public class DataFromConsole {

	public static void main(String[] args) {
	
		//Importing Scanner class By creating object	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		float a = sc.nextFloat();
		
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		
		System.out.println("Addition of a and b is: "+(a+b));
		
		

	}

}
