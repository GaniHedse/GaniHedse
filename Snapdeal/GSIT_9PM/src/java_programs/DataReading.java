package java_programs;

import java.util.Scanner;

public class DataReading {

	public static void main(String[] args) {

		// Importing Scanner class by Creating object

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a");

		int a = sc.nextInt();

		System.out.println("Enter the value of b");

		int b = sc.nextInt();

		System.out.println("Enter the value of c");

		int c = sc.nextInt();

		System.out.println("Addition of a, b, and c is: " + (a + b + c));
		System.out.println("Multiplication of a, b, and c is: " + (a * b * c));
		
		sc.close();

	}

}
