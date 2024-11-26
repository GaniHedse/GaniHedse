package package2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");

		int num = sc.nextInt();
		
		int temp =0;
		
		for(int i=2; i<=num-1; i++) {
			
			if(num%i==0) {
				temp = temp+1;
			}
		}
		
		if(temp ==0) {
			System.out.println("Its Prime Number");
		}
		else {
			System.out.println("Its Not a Prime Number");
		}

	}

}
