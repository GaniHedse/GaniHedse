package package2;

import java.util.Scanner;

public class PalindromNum {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");

		int num = sc.nextInt(); //123
		int temp = num;
		int rem;
		int sum =0;
		
		while(num>0) {
			rem = num % 10;
			sum = sum*10 + rem;
			num = num / 10;
		}
		
		if(sum==temp) {
			System.out.println("Its Palindrom Number");
		}
		else {
			System.out.println("Its Not Palindrom Number");
		}
	}

	}


