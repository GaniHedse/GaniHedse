package package2;

import java.util.Scanner;

public class SumofDigit {

public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");

		int num = sc.nextInt(); //123
		int temp = num;
		int rem;
		int sum =0;
		
		while(num>0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		
		System.out.println("Sum of Digit is: "+sum);
}
}
