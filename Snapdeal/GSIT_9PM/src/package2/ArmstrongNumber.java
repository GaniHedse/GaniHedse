package package2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");

		int num = sc.nextInt();
		
		// 153 = 1+125+27 =153
		
		int temp = num;
		
		int rem;
		int sum = 0;
		
		while(num!=0) {
			
		rem = num%10; 
		sum = sum+(rem*rem*rem); //321
		num = num/10;	
		}
		
		if(temp==sum) {
			System.out.println("Its Armstrong Number");
		}
		else {
			System.out.println("Its Not Armstrong Number");
		}	

	}

}
