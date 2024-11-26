package package2;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");

		int num = sc.nextInt(); 
		
		//153= 1+125+27
		
		int temp = num;
		int rem;
		int sum =0;
		
		while(num>0) {
			rem = num % 10;
			sum = sum + (rem*rem*rem);
			num = num / 10;
		}
		
		if(sum ==temp) {
			System.out.println("Its Armstrong Number");
		}
		else {
			System.out.println("Its Not Armstrong Number");
		}
		
	}

}
