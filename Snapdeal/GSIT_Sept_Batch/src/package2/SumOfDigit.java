package package2;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");

		int num = sc.nextInt();

		int rem; int sum =0; //123
		
		while(num >0) {
			rem = num % 10; //1
			sum = sum +rem; //6
			num = num/10; //1
			
		}
		
		System.out.println("Sum of Digit is: "+sum);
	}

}
